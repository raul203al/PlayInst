package interfaces;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import clases.Key;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Piano extends JPanel {
	
	private Clip audioClip;
	private AudioInputStream audioInputStream;
	private ArrayList<Key> pianoKeys;
		
	public Piano(Window w) {		
		BufferedImage pianoBody = null;

		
		try {
			pianoKeys = new Key().getPianoKeys();
			pianoBody = ImageIO.read(new File("images/piano_body.png"));

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JLabel pianoLabel = new JLabel(new ImageIcon(pianoBody));
		add(pianoLabel);
		
		JButton a0 = new JButton(new ImageIcon(pianoKeys.get(0).getKeyImage()));
		a0.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					audioInputStream = AudioSystem.getAudioInputStream(pianoKeys.get(0).getNote());
					audioClip = AudioSystem.getClip();
					audioClip.open(audioInputStream);
					audioClip.start();



				} catch (UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				audioClip.stop();
			}
		});
		
		add(a0);
	}

}
