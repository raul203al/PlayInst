package interfaces;

import javax.swing.JPanel;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
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
		
		JButton pianoButton = new JButton("");
		pianoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				w.goToScreen("piano");
			}
		});
		pianoButton.setBounds(80, 259, 286, 266);
		add(pianoButton);
		pianoButton.setIcon(new ImageIcon(newPianoImage));
		pianoButton.setFocusPainted(false);
		//pianoButton.setContentAreaFilled(false);
		
	}
}
