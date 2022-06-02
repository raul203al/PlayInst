package interfaces;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import clases.User;

import javax.swing.DropMode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JPasswordField;

public class Register extends JPanel {
	private Window window;
	private JTextField userField;
	private JTextField emailField;
	private JPasswordField passwordField;

	public Register(Window w) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 313, 0, 171, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		JLabel registerTitle = new JLabel("Registro");
		registerTitle.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		GridBagConstraints gbc_registerTitle = new GridBagConstraints();
		gbc_registerTitle.insets = new Insets(0, 0, 5, 5);
		gbc_registerTitle.gridx = 10;
		gbc_registerTitle.gridy = 4;
		add(registerTitle, gbc_registerTitle);
		
		JLabel userText = new JLabel("Usuario:");
		userText.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_userText = new GridBagConstraints();
		gbc_userText.insets = new Insets(0, 0, 5, 5);
		gbc_userText.anchor = GridBagConstraints.EAST;
		gbc_userText.gridx = 9;
		gbc_userText.gridy = 7;
		add(userText, gbc_userText);
		
		userField = new JTextField();
		userField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		userField.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_userField = new GridBagConstraints();
		gbc_userField.insets = new Insets(0, 0, 5, 5);
		gbc_userField.fill = GridBagConstraints.HORIZONTAL;
		gbc_userField.gridx = 10;
		gbc_userField.gridy = 7;
		add(userField, gbc_userField);
		userField.setColumns(10);
		
		JLabel emailText = new JLabel("Correo:");
		emailText.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_emailText = new GridBagConstraints();
		gbc_emailText.insets = new Insets(0, 0, 5, 5);
		gbc_emailText.anchor = GridBagConstraints.EAST;
		gbc_emailText.gridx = 9;
		gbc_emailText.gridy = 11;
		add(emailText, gbc_emailText);
		
		emailField = new JTextField();
		GridBagConstraints gbc_emailField = new GridBagConstraints();
		gbc_emailField.insets = new Insets(0, 0, 5, 5);
		gbc_emailField.fill = GridBagConstraints.HORIZONTAL;
		gbc_emailField.gridx = 10;
		gbc_emailField.gridy = 11;
		add(emailField, gbc_emailField);
		emailField.setColumns(10);
		
		JLabel passwordText = new JLabel("Contraseña:");
		passwordText.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GridBagConstraints gbc_passwordText = new GridBagConstraints();
		gbc_passwordText.anchor = GridBagConstraints.EAST;
		gbc_passwordText.insets = new Insets(0, 0, 5, 5);
		gbc_passwordText.gridx = 9;
		gbc_passwordText.gridy = 15;
		add(passwordText, gbc_passwordText);
		
		JButton registerButton = new JButton("Registrarse");
		registerButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		registerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			try {
					User user = new User(userField.getText(), emailField.getText(), new String(passwordField.getPassword()));
					JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
					w.goToScreen("login");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 10;
		gbc_passwordField.gridy = 15;
		add(passwordField, gbc_passwordField);
		GridBagConstraints gbc_registerButton = new GridBagConstraints();
		gbc_registerButton.insets = new Insets(0, 0, 0, 5);
		gbc_registerButton.gridx = 9;
		gbc_registerButton.gridy = 18;
		add(registerButton, gbc_registerButton);
		
		JButton backButton = new JButton("Inicio");
		backButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				w.goToScreen("login");
			}
		});
		GridBagConstraints gbc_backButton = new GridBagConstraints();
		gbc_backButton.gridx = 11;
		gbc_backButton.gridy = 18;
		add(backButton, gbc_backButton);
	}

}
