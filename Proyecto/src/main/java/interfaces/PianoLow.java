package interfaces;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import clases.Instrument;
import clases.Key;
import clases.Recorder;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class PianoLow extends JPanel {
	private ArrayList<Key> pianoKeys;



	public PianoLow(Window w) {

		BufferedImage pianoTop = null;
		BufferedImage backButtonI = null;
		BufferedImage pianoLeftRight = null;
		BufferedImage gray = null;
		BufferedImage white = null;
		BufferedImage black = null;
		BufferedImage grayBlack = null;

		try {
			pianoKeys = new Key().getPianoKeys();
			pianoTop = ImageIO.read(new File("images/piano_body_top.png"));
			pianoLeftRight = ImageIO.read(new File("images/piano_body_lr.png"));
			backButtonI = ImageIO.read(new File("images/back_button.png"));
			gray = ImageIO.read(new File("keys/images/gray_tile.png"));
			white = ImageIO.read(new File("keys/images/white_tile.png"));
			black = ImageIO.read(new File("keys/images/black_tile.png"));
			grayBlack = ImageIO.read(new File("keys/images/black_gray_tile.png"));

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		final BufferedImage grayTile = gray;
		final BufferedImage whiteTile = white;
		final BufferedImage blackTile = black;
		final BufferedImage grayBlackTile = grayBlack;

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1547, 1039);
		JButton cs1 = new JButton(new ImageIcon(pianoKeys.get(4).getKeyImage()));
		cs1.setBounds(649, 412, 28, 118);
		JButton d1 = new JButton(new ImageIcon(pianoKeys.get(5).getKeyImage()));
		d1.setBounds(649, 412, 50, 257);
		JButton e1 = new JButton(new ImageIcon(pianoKeys.get(7).getKeyImage()));
		e1.setBounds(697, 412, 50, 257);
		JButton f1 = new JButton(new ImageIcon(pianoKeys.get(8).getKeyImage()));
		f1.setBounds(742, 412, 43, 257);
		JButton g1 = new JButton(new ImageIcon(pianoKeys.get(10).getKeyImage()));
		g1.setBounds(776, 412, 50, 257);
		JButton a1 = new JButton(new ImageIcon(pianoKeys.get(12).getKeyImage()));
		a1.setBounds(822, 412, 50, 257);
		JButton b1 = new JButton(new ImageIcon(pianoKeys.get(14).getKeyImage()));
		b1.setBounds(865, 412, 50, 257);
		JButton cs2 = new JButton(new ImageIcon(pianoKeys.get(16).getKeyImage()));
		cs2.setBounds(960, 412, 28, 118);
		JButton d2 = new JButton(new ImageIcon(pianoKeys.get(17).getKeyImage()));
		d2.setBounds(960, 412, 50, 257);
		JButton e2 = new JButton(new ImageIcon(pianoKeys.get(19).getKeyImage()));
		e2.setBounds(1006, 412, 50, 257);
		JButton fs2 = new JButton(new ImageIcon(pianoKeys.get(21).getKeyImage()));
		fs2.setBounds(1089, 412, 28, 118);
		JButton a2 = new JButton(new ImageIcon(pianoKeys.get(24).getKeyImage()));
		a2.setBounds(1136, 412, 50, 257);
		JButton b2 = new JButton(new ImageIcon(pianoKeys.get(26).getKeyImage()));
		b2.setBounds(1183, 412, 50, 257);
		JButton cs3 = new JButton(new ImageIcon(pianoKeys.get(28).getKeyImage()));
		cs3.setBounds(1274, 412, 28, 118);
		JButton d3 = new JButton(new ImageIcon(pianoKeys.get(29).getKeyImage()));
		d3.setBounds(1274, 412, 50, 257);
		JButton e3 = new JButton(new ImageIcon(pianoKeys.get(31).getKeyImage()));
		e3.setBounds(1322, 412, 50, 257);
		JButton f3 = new JButton(new ImageIcon(pianoKeys.get(32).getKeyImage()));
		f3.setBounds(1370, 412, 50, 257);
		JButton g3 = new JButton(new ImageIcon(pianoKeys.get(34).getKeyImage()));
		g3.setBounds(1415, 412, 50, 257);
		JButton a3 = new JButton(new ImageIcon(pianoKeys.get(36).getKeyImage()));
		a3.setBounds(132, 47, 33, 9);
		JButton as3 = new JButton(new ImageIcon(pianoKeys.get(37).getKeyImage()));
		as3.setBounds(170, 47, 33, 9);
		JButton b3 = new JButton(new ImageIcon(pianoKeys.get(38).getKeyImage()));
		b3.setBounds(208, 47, 33, 9);
		JButton c4 = new JButton(new ImageIcon(pianoKeys.get(39).getKeyImage()));
		c4.setBounds(246, 47, 33, 9);
		JButton cs4 = new JButton(new ImageIcon(pianoKeys.get(40).getKeyImage()));
		cs4.setBounds(284, 47, 33, 9);
		JButton d4 = new JButton(new ImageIcon(pianoKeys.get(41).getKeyImage()));
		d4.setBounds(322, 47, 33, 9);
		JButton ds4 = new JButton(new ImageIcon(pianoKeys.get(42).getKeyImage()));
		ds4.setBounds(360, 47, 33, 9);
		JButton e4 = new JButton(new ImageIcon(pianoKeys.get(43).getKeyImage()));
		e4.setBounds(398, 47, 33, 9);
		JButton f4 = new JButton(new ImageIcon(pianoKeys.get(44).getKeyImage()));
		f4.setBounds(18, 61, 33, 9);
		JButton fs4 = new JButton(new ImageIcon(pianoKeys.get(45).getKeyImage()));
		fs4.setBounds(56, 61, 33, 9);
		JButton g4 = new JButton(new ImageIcon(pianoKeys.get(46).getKeyImage()));
		g4.setBounds(94, 61, 33, 9);
		JButton gs4 = new JButton(new ImageIcon(pianoKeys.get(47).getKeyImage()));
		gs4.setBounds(132, 61, 33, 9);
		JButton a4 = new JButton(new ImageIcon(pianoKeys.get(48).getKeyImage()));
		a4.setBounds(170, 61, 33, 9);
		JButton as4 = new JButton(new ImageIcon(pianoKeys.get(49).getKeyImage()));
		as4.setBounds(208, 61, 33, 9);
		JButton b4 = new JButton(new ImageIcon(pianoKeys.get(50).getKeyImage()));
		b4.setBounds(246, 61, 33, 9);
		JButton c5 = new JButton(new ImageIcon(pianoKeys.get(51).getKeyImage()));
		c5.setBounds(284, 61, 33, 9);
		JButton d5 = new JButton(new ImageIcon(pianoKeys.get(52).getKeyImage()));
		d5.setBounds(322, 61, 33, 9);
		JButton ds5 = new JButton(new ImageIcon(pianoKeys.get(53).getKeyImage()));
		ds5.setBounds(360, 61, 33, 9);
		JButton e5 = new JButton(new ImageIcon(pianoKeys.get(54).getKeyImage()));
		e5.setBounds(398, 61, 33, 9);
		JButton f5 = new JButton(new ImageIcon(pianoKeys.get(55).getKeyImage()));
		f5.setBounds(18, 75, 33, 9);
		JButton g5 = new JButton(new ImageIcon(pianoKeys.get(56).getKeyImage()));
		g5.setBounds(56, 75, 33, 9);
		JButton gs5 = new JButton(new ImageIcon(pianoKeys.get(57).getKeyImage()));
		gs5.setBounds(94, 75, 33, 9);
		JButton a5 = new JButton(new ImageIcon(pianoKeys.get(58).getKeyImage()));
		a5.setBounds(132, 75, 33, 9);
		JButton b5 = new JButton(new ImageIcon(pianoKeys.get(59).getKeyImage()));
		b5.setBounds(170, 75, 33, 9);
		JButton c6 = new JButton(new ImageIcon(pianoKeys.get(60).getKeyImage()));
		c6.setBounds(208, 75, 33, 9);
		JButton cs6 = new JButton(new ImageIcon(pianoKeys.get(61).getKeyImage()));
		cs6.setBounds(246, 75, 33, 9);
		JButton d6 = new JButton(new ImageIcon(pianoKeys.get(62).getKeyImage()));
		d6.setBounds(284, 75, 33, 9);
		JButton ds6 = new JButton(new ImageIcon(pianoKeys.get(63).getKeyImage()));
		ds6.setBounds(322, 75, 33, 9);
		JButton e6 = new JButton(new ImageIcon(pianoKeys.get(64).getKeyImage()));
		e6.setBounds(360, 75, 33, 9);
		JButton f6 = new JButton(new ImageIcon(pianoKeys.get(65).getKeyImage()));
		f6.setBounds(398, 75, 33, 9);
		JButton fs6 = new JButton(new ImageIcon(pianoKeys.get(66).getKeyImage()));
		fs6.setBounds(18, 89, 33, 9);
		JButton g6 = new JButton(new ImageIcon(pianoKeys.get(67).getKeyImage()));
		g6.setBounds(56, 89, 33, 9);
		JButton gs6 = new JButton(new ImageIcon(pianoKeys.get(68).getKeyImage()));
		gs6.setBounds(94, 89, 33, 9);
		JButton a6 = new JButton(new ImageIcon(pianoKeys.get(69).getKeyImage()));
		a6.setBounds(132, 89, 33, 9);
		JButton as6 = new JButton(new ImageIcon(pianoKeys.get(70).getKeyImage()));
		as6.setBounds(170, 89, 33, 9);
		JButton b6 = new JButton(new ImageIcon(pianoKeys.get(71).getKeyImage()));
		b6.setBounds(208, 89, 33, 9);
		JButton c7 = new JButton(new ImageIcon(pianoKeys.get(72).getKeyImage()));
		c7.setBounds(246, 89, 33, 9);
		JButton cs7 = new JButton(new ImageIcon(pianoKeys.get(73).getKeyImage()));
		cs7.setBounds(284, 89, 33, 9);
		JButton d7 = new JButton(new ImageIcon(pianoKeys.get(74).getKeyImage()));
		d7.setBounds(322, 89, 33, 9);
		JButton ds7 = new JButton(new ImageIcon(pianoKeys.get(75).getKeyImage()));
		ds7.setBounds(360, 89, 33, 9);
		JButton e7 = new JButton(new ImageIcon(pianoKeys.get(76).getKeyImage()));
		e7.setBounds(398, 89, 33, 9);
		JButton f7 = new JButton(new ImageIcon(pianoKeys.get(77).getKeyImage()));
		f7.setBounds(75, 103, 33, 9);
		JButton fs7 = new JButton(new ImageIcon(pianoKeys.get(78).getKeyImage()));
		fs7.setBounds(113, 103, 33, 9);
		JButton g7 = new JButton(new ImageIcon(pianoKeys.get(79).getKeyImage()));
		g7.setBounds(151, 103, 33, 9);
		JButton gs7 = new JButton(new ImageIcon(pianoKeys.get(80).getKeyImage()));
		gs7.setBounds(189, 103, 33, 9);
		JButton a7 = new JButton(new ImageIcon(pianoKeys.get(81).getKeyImage()));
		a7.setBounds(227, 103, 33, 9);
		JButton as7 = new JButton(new ImageIcon(pianoKeys.get(82).getKeyImage()));
		as7.setBounds(265, 103, 33, 9);
		JButton b7 = new JButton(new ImageIcon(pianoKeys.get(83).getKeyImage()));
		b7.setBounds(303, 103, 33, 9);
		JButton c8 = new JButton(new ImageIcon(pianoKeys.get(84).getKeyImage()));
		c8.setBounds(341, 103, 33, 9);
		setLayout(null);

		add(panel);
		panel.setLayout(null);

		JButton as0 = new JButton(new ImageIcon(pianoKeys.get(1).getKeyImage()));
		as0.setBounds(557, 412, 28, 118);

		JButton ds3 = new JButton(new ImageIcon(pianoKeys.get(30).getKeyImage()));
		ds3.setBounds(1321, 412, 28, 118);

		JButton ds1 = new JButton(new ImageIcon(pianoKeys.get(6).getKeyImage()));
		ds1.setBounds(697, 412, 28, 118);

		JButton fs1 = new JButton(new ImageIcon(pianoKeys.get(9).getKeyImage()));
		fs1.setBounds(776, 412, 28, 118);

		JButton gs1 = new JButton(new ImageIcon(pianoKeys.get(11).getKeyImage()));
		gs1.setBounds(822, 412, 28, 118);

		JButton as1 = new JButton(new ImageIcon(pianoKeys.get(13).getKeyImage()));
		as1.setBounds(863, 412, 28, 118);

		JButton ds2 = new JButton(new ImageIcon(pianoKeys.get(18).getKeyImage()));
		ds2.setBounds(1005, 412, 28, 118);

		JButton gs2 = new JButton(new ImageIcon(pianoKeys.get(23).getKeyImage()));
		gs2.setBounds(1136, 412, 28, 118);
		JButton as2 = new JButton(new ImageIcon(pianoKeys.get(25).getKeyImage()));
		as2.setBounds(1183, 412, 28, 118);

		JButton fs3 = new JButton(new ImageIcon(pianoKeys.get(33).getKeyImage()));
		fs3.setBounds(1370, 412, 28, 118);

		JButton gs3 = new JButton(new ImageIcon(pianoKeys.get(35).getKeyImage()));
		gs3.setBounds(1452, 412, 27, 118);

		JButton b0 = new JButton(new ImageIcon(pianoKeys.get(2).getKeyImage()));
		b0.setBounds(557, 412, 50, 257);

		JButton a0 = new JButton(new ImageIcon(pianoKeys.get(0).getKeyImage()));
		a0.setBounds(510, 412, 50, 257);

		JButton c1 = new JButton(new ImageIcon(pianoKeys.get(3).getKeyImage()));
		c1.setBounds(603, 412, 50, 257);

		JButton c2 = new JButton(new ImageIcon(pianoKeys.get(15).getKeyImage()));
		c2.setBounds(912, 412, 50, 257);

		JButton f2 = new JButton(new ImageIcon(pianoKeys.get(20).getKeyImage()));
		f2.setBounds(1047, 412, 50, 257);

		JButton g2 = new JButton(new ImageIcon(pianoKeys.get(22).getKeyImage()));
		g2.setBounds(1089, 412, 50, 257);
		JButton c3 = new JButton(new ImageIcon(pianoKeys.get(27).getKeyImage()));
		c3.setBounds(1227, 412, 50, 257);
		

		a0.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_Q) {
					Instrument.playSound(pianoKeys.get(0).getNote());
					a0.setIcon(new ImageIcon(grayTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_W) {
					Instrument.playSound(pianoKeys.get(1).getNote());
					as0.setIcon(new ImageIcon(grayBlackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_E) {
					Instrument.playSound(pianoKeys.get(2).getNote());
					b0.setIcon(new ImageIcon(grayTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_R) {
					Instrument.playSound(pianoKeys.get(3).getNote());
					c1.setIcon(new ImageIcon(grayTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_T) {
					Instrument.playSound(pianoKeys.get(4).getNote());
					cs1.setIcon(new ImageIcon(grayBlackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_Y) {
					Instrument.playSound(pianoKeys.get(5).getNote());
					d1.setIcon(new ImageIcon(grayTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_U) {
					Instrument.playSound(pianoKeys.get(6).getNote());
					ds1.setIcon(new ImageIcon(grayBlackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_I) {
					Instrument.playSound(pianoKeys.get(7).getNote());
					e1.setIcon(new ImageIcon(grayTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_O) {
					Instrument.playSound(pianoKeys.get(8).getNote());
					f1.setIcon(new ImageIcon(grayTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_P) {
					Instrument.playSound(pianoKeys.get(9).getNote());
					fs1.setIcon(new ImageIcon(grayBlackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_A) {
					Instrument.playSound(pianoKeys.get(10).getNote());
					g1.setIcon(new ImageIcon(grayTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_S) {
					Instrument.playSound(pianoKeys.get(11).getNote());
					gs1.setIcon(new ImageIcon(grayBlackTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_D) {
					Instrument.playSound(pianoKeys.get(12).getNote());
					a1.setIcon(new ImageIcon(grayTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_F) {
					Instrument.playSound(pianoKeys.get(13).getNote());
					as1.setIcon(new ImageIcon(grayBlackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_G) {
					Instrument.playSound(pianoKeys.get(14).getNote());
					b1.setIcon(new ImageIcon(grayTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_H) {
					Instrument.playSound(pianoKeys.get(15).getNote());
					c2.setIcon(new ImageIcon(grayTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_J) {
					Instrument.playSound(pianoKeys.get(16).getNote());
					cs2.setIcon(new ImageIcon(grayBlackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_K) {
					Instrument.playSound(pianoKeys.get(17).getNote());
					d2.setIcon(new ImageIcon(grayTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_L) {
					Instrument.playSound(pianoKeys.get(18).getNote());
					ds2.setIcon(new ImageIcon(grayBlackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_Z) {
					Instrument.playSound(pianoKeys.get(19).getNote());
					e2.setIcon(new ImageIcon(grayTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_X) {
					Instrument.playSound(pianoKeys.get(20).getNote());
					f2.setIcon(new ImageIcon(grayTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_C) {
					Instrument.playSound(pianoKeys.get(21).getNote());
					fs2.setIcon(new ImageIcon(grayBlackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_V) {
					Instrument.playSound(pianoKeys.get(22).getNote());
					g2.setIcon(new ImageIcon(grayTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_B) {
					Instrument.playSound(pianoKeys.get(23).getNote());
					gs2.setIcon(new ImageIcon(grayBlackTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_N) {
					Instrument.playSound(pianoKeys.get(24).getNote());
					a2.setIcon(new ImageIcon(grayTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_M) {
					Instrument.playSound(pianoKeys.get(25).getNote());
					as2.setIcon(new ImageIcon(grayBlackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_1) {
					Instrument.playSound(pianoKeys.get(26).getNote());
					b2.setIcon(new ImageIcon(grayTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_2) {
					Instrument.playSound(pianoKeys.get(27).getNote());
					c3.setIcon(new ImageIcon(grayTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_3) {
					Instrument.playSound(pianoKeys.get(28).getNote());
					cs3.setIcon(new ImageIcon(grayBlackTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_4) {
					Instrument.playSound(pianoKeys.get(29).getNote());
					d3.setIcon(new ImageIcon(grayTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_5) {
					Instrument.playSound(pianoKeys.get(30).getNote());
					ds3.setIcon(new ImageIcon(grayBlackTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_6) {
					Instrument.playSound(pianoKeys.get(31).getNote());
					e3.setIcon(new ImageIcon(grayTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_7) {
					Instrument.playSound(pianoKeys.get(32).getNote());
					f3.setIcon(new ImageIcon(grayTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_8) {
					Instrument.playSound(pianoKeys.get(33).getNote());
					fs3.setIcon(new ImageIcon(grayBlackTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_9) {
					Instrument.playSound(pianoKeys.get(34).getNote());
					g3.setIcon(new ImageIcon(grayTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_0) {
					Instrument.playSound(pianoKeys.get(35).getNote());
					gs3.setIcon(new ImageIcon(grayBlackTile));
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_Q) {
					a0.setIcon(new ImageIcon(whiteTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_W) {
					as0.setIcon(new ImageIcon(blackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_E) {
					b0.setIcon(new ImageIcon(whiteTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_R) {
					c1.setIcon(new ImageIcon(whiteTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_T) {
					cs1.setIcon(new ImageIcon(blackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_Y) {
					d1.setIcon(new ImageIcon(whiteTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_U) {
					ds1.setIcon(new ImageIcon(blackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_I) {
					e1.setIcon(new ImageIcon(whiteTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_O) {
					f1.setIcon(new ImageIcon(whiteTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_P) {
					fs1.setIcon(new ImageIcon(blackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_A) {
					g1.setIcon(new ImageIcon(whiteTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_S) {
					gs1.setIcon(new ImageIcon(blackTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_D) {
					a1.setIcon(new ImageIcon(whiteTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_F) {
					as1.setIcon(new ImageIcon(blackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_G) {
					b1.setIcon(new ImageIcon(whiteTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_H) {
					c2.setIcon(new ImageIcon(whiteTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_J) {
					cs2.setIcon(new ImageIcon(blackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_K) {
					d2.setIcon(new ImageIcon(whiteTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_L) {
					ds2.setIcon(new ImageIcon(blackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_Z) {
					e2.setIcon(new ImageIcon(whiteTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_X) {
					f2.setIcon(new ImageIcon(whiteTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_C) {
					fs2.setIcon(new ImageIcon(blackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_V) {
					g2.setIcon(new ImageIcon(whiteTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_B) {
					gs2.setIcon(new ImageIcon(blackTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_N) {
					a2.setIcon(new ImageIcon(whiteTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_M) {
					as2.setIcon(new ImageIcon(blackTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_1) {
					b2.setIcon(new ImageIcon(whiteTile));
				}
				if (e.getKeyCode() == KeyEvent.VK_2) {
					c3.setIcon(new ImageIcon(whiteTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_3) {
					cs3.setIcon(new ImageIcon(blackTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_4) {
					d3.setIcon(new ImageIcon(whiteTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_5) {
					ds3.setIcon(new ImageIcon(blackTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_6) {
					e3.setIcon(new ImageIcon(whiteTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_7) {
					f3.setIcon(new ImageIcon(whiteTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_8) {
					fs3.setIcon(new ImageIcon(blackTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_9) {

					g3.setIcon(new ImageIcon(whiteTile));
				}

				if (e.getKeyCode() == KeyEvent.VK_0) {
					gs3.setIcon(new ImageIcon(blackTile));
				}
				Instrument.stopSound();
			}
		});

		panel.add(a0);
		panel.add(as0);
		panel.add(ds3);
		panel.add(cs1);
		panel.add(ds1);
		panel.add(d1);
		panel.add(e1);
		panel.add(fs1);
		panel.add(f1);
		panel.add(gs1);
		panel.add(g1);
		panel.add(as1);
		panel.add(a1);
		panel.add(b1);
		panel.add(cs2);
		panel.add(ds2);
		panel.add(d2);
		panel.add(e2);
		panel.add(fs2);
		panel.add(gs2);
		panel.add(as2);
		panel.add(a2);
		panel.add(b2);
		panel.add(cs3);
		panel.add(d3);
		panel.add(e3);
		panel.add(fs3);
		panel.add(f3);
		panel.add(gs3);
		panel.add(g3);
		panel.add(b0);
		panel.add(c1);
		panel.add(c2);
		panel.add(f2);
		panel.add(g2);
		panel.add(c3);

		JLabel pianoTopJLabel = new JLabel(new ImageIcon(pianoTop));
		pianoTopJLabel.setBounds(510, 325, 969, 88);
		panel.add(pianoTopJLabel);

		JLabel pianoLeftJLabel = new JLabel(new ImageIcon(pianoLeftRight));
		pianoLeftJLabel.setBounds(452, 325, 60, 344);
		panel.add(pianoLeftJLabel);

		JLabel pianoRightJLabel = new JLabel(new ImageIcon(pianoLeftRight));
		pianoRightJLabel.setBounds(1464, 325, 60, 341);
		panel.add(pianoRightJLabel);
		
		JLabel backButtonJLabel = new JLabel(new ImageIcon(backButtonI));
		backButtonJLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				w.goToScreen("menu");
			}
		});
		backButtonJLabel.setBounds(42, 31, 127, 127);
		panel.add(backButtonJLabel);
		
		JButton parar = new JButton("Parar");
		JButton grabar = new JButton("Grabar");
		grabar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grabar.setVisible(false);
				backButtonJLabel.setVisible(false);
				parar.setVisible(true);
				Recorder.record();
			}
		});
		grabar.setBounds(510, 244, 89, 23);
		panel.add(grabar);
		
		parar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Recorder.finish();
				backButtonJLabel.setVisible(true);
				parar.setVisible(false);
				grabar.setVisible(true);
			}
		});
		parar.setBounds(510, 244, 89, 23);
		panel.add(parar);
		parar.setVisible(false);

		
		/*
		 * panel.add(a3); panel.add(as3); panel.add(b3); panel.add(c4); panel.add(cs4);
		 * panel.add(d4); panel.add(ds4); panel.add(e4); panel.add(f4); panel.add(fs4);
		 * panel.add(g4); panel.add(gs4); panel.add(a4); panel.add(as4); panel.add(b4);
		 * panel.add(c5); panel.add(d5); panel.add(ds5); panel.add(e5); panel.add(f5);
		 * // panel.add(fs5); panel.add(g5); panel.add(gs5); panel.add(a5); //
		 * panel.add(as5); panel.add(b5); panel.add(c6); panel.add(cs6); panel.add(d6);
		 * panel.add(ds6); panel.add(e6); panel.add(f6); panel.add(fs6); panel.add(g6);
		 * panel.add(gs6); panel.add(a6); panel.add(as6); panel.add(b6); panel.add(c7);
		 * panel.add(cs7); panel.add(d7); panel.add(ds7); panel.add(e7); panel.add(f7);
		 * panel.add(fs7); panel.add(g7); panel.add(gs7); panel.add(a7); panel.add(as7);
		 * panel.add(b7); panel.add(c8);
		 */
	}
}
