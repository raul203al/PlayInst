package clases;

import java.io.File;
import java.io.SequenceInputStream;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

/**
 * Clase que se encarga de concatenar dos audios tipo WAVE
 * @author raul203al
 *
 */
public class SongMerger {
	
	/**
	 * Funcion que se encarga de recibir los archivos WAV y posteriormente los concatena
	 * @param wav1 String del nombre del archivo
	 * @param wav2 String del nombre del archivo
	 */
	public static void merger(String wav1, String wav2) {

	        try {
	            AudioInputStream clip1 = AudioSystem.getAudioInputStream(new File(wav1));
	            AudioInputStream clip2 = AudioSystem.getAudioInputStream(new File(wav2));

	            AudioInputStream appendedFiles = 
	                            new AudioInputStream(
	                                new SequenceInputStream(clip1, clip2),     
	                                clip1.getFormat(), 
	                                clip1.getFrameLength() + clip2.getFrameLength());

	            AudioSystem.write(appendedFiles, 
	                            AudioFileFormat.Type.WAVE, 
	                            new File("./cancion.wav"));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
