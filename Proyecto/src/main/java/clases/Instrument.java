package clases;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Clase instrumento que se encarga de reproducir el sonido de las notas
 * @author raul203al
 *
 */
public class Instrument {
	
	private static Clip clip;
	private static AudioInputStream inputStream;
	private static FloatControl gainControl;
	
	/**
	 * Funcion que reproduce el sonido del archivo por parametros
	 * @param Note archivo de sonido
	 */
	public static synchronized void playSound(File Note) {

		try {
			inputStream = AudioSystem.getAudioInputStream(Note);
			clip = AudioSystem.getClip();

			clip.open(inputStream);

			gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-10.0f);

			clip.start();

		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * Funcion que para el sonido
	 */
	public static synchronized void stopSound() {

		try {
			clip = AudioSystem.getClip();

			clip.open(inputStream);
			clip.stop();
			clip.close();

		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
