package interfaces;

import javax.swing.JPanel;

import clases.SongMerger;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JPanel {
	public Menu(Window w) {
		setLayout(null);
	
		JLabel lblNewLabel = new JLabel("Menú");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(525, 39, 410, 107);
		add(lblNewLabel);
		
		ImageIcon pianoIcon = new ImageIcon("images/pianoIcon.png");
		Image pianoImage = pianoIcon.getImage();
		Image newPianoImage = pianoImage.getScaledInstance(280, 220, Image.SCALE_SMOOTH);
		
		JButton pianoLowButton = new JButton("");
		pianoLowButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				w.goToScreen("pianoLow");
			}
		});
		pianoLowButton.setBounds(86, 267, 286, 266);
		pianoLowButton.setIcon(new ImageIcon(newPianoImage));
		pianoLowButton.setFocusPainted(false);
		add(pianoLowButton);
		
		JButton pianoMediumButton = new JButton("");
		pianoMediumButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				w.goToScreen("pianoMedium");
			}
		});
		pianoMediumButton.setBounds(515, 267, 286, 266);
		pianoMediumButton.setIcon(new ImageIcon(newPianoImage));
		pianoMediumButton.setFocusPainted(false);
		add(pianoMediumButton);
		
		JLabel pianoLowText = new JLabel("Piano Notas Bajas");
		pianoLowText.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		pianoLowText.setBounds(148, 546, 190, 45);
		add(pianoLowText);
		
		JLabel pianoMediumText = new JLabel("Pianos Notas Medias");
		pianoMediumText.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		pianoMediumText.setBounds(556, 560, 228, 17);
		add(pianoMediumText);
		
		JButton btnNewButton = new JButton("Juntar Canciones");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String wav1 = JOptionPane.showInputDialog(null,"Inserta el nombre del 1er archivo");
				String wav2 = JOptionPane.showInputDialog(null,"Inserta el nombre del 2o archivo");
				SongMerger.merger(wav1, wav2);
				JOptionPane.showMessageDialog(null, "Hecho Compruebe que el archivo a sido creado");

			}
		});
		btnNewButton.setBounds(86, 158, 180, 45);
		add(btnNewButton);
		
	}
}
