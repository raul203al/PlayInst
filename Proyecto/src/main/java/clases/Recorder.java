package clases;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

/**
 * Clase que se encarga de grabar el sonido producido y guardarlo en un archivo WAVE
 * @author raul203al
 *
 */
public class Recorder {

	private static AudioFormat format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100, 16, 2, 4, 44100, false);

	private static DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);

	private static TargetDataLine targetLine;
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
	private static LocalDateTime time = LocalDateTime.now();

	/**
	 * Funcion que se encarga de grabar el sonido
	 */
	public static void record() {
		try {

			// checks if system supports the data line
			if (!AudioSystem.isLineSupported(info)) {
				System.out.println("Line not supported");
				System.exit(0);
			}

			targetLine = AudioSystem.getTargetDataLine(format);
			targetLine.open();
			targetLine.start(); // start capturing

			Thread audioRecorderThread = new Thread() {
				@Override
				public void run() {
					AudioInputStream recordingStream = new AudioInputStream(targetLine);
					File outputFile = new File(dtf.format(time) + ".wav");
					try {
						AudioSystem.write(recordingStream, AudioFileFormat.Type.WAVE, outputFile);
					} catch (IOException e) {
						// TODO: handle exception
						System.out.println(e);
					}

					System.out.println("Stopped");
				}
			};

			audioRecorderThread.start();

		} catch (LineUnavailableException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Funcion que cierra el DataLine parando la grabacion
	 */
	public static void finish() {
		targetLine.stop();
		targetLine.close();
		System.out.println("Finished");
	}

}
