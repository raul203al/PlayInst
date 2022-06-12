package interfaces;


import javax.swing.JPanel;

import javax.swing.JButton;

import java.awt.Font;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import clases.User;

import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * Interfaz del login para poder acceder al menu de los instrumentos
 * @author raul203al
 *
 */
public class Login extends JPanel {
	private Window window;
	private JTextField userField;
	private JPasswordField passwordField;

	public Login(Window w) {
		this.window = w;
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(770, 450, 120, 33);
		loginButton.setFocusable(false);
		loginButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String user = userField.getText();
				String password = new String(passwordField.getPassword());

					try {
						window.loggedUser = new User(user, password);

					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, "Usuario Incorrecto");

						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(window, "Bienvenido " + window.loggedUser.getName());

					w.goToScreen("menu");

			}
		});
		setLayout(null);
		
		JLabel loginTittle = new JLabel("Iniciar Sesión");
		loginTittle.setBounds(865, 109, 218, 47);
		loginTittle.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		add(loginTittle);
		
		JLabel usenarmeText = new JLabel("Usuario:");
		usenarmeText.setBounds(795, 251, 60, 21);
		usenarmeText.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		add(usenarmeText);
		
		userField = new JTextField();
		userField.setBounds(865, 249, 218, 26);
		userField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		userField.setColumns(10);
		userField.setHorizontalAlignment(SwingConstants.LEFT);
		add(userField);
		
		JLabel passwordText = new JLabel("ContraseÃ±a:");
		passwordText.setBounds(770, 336, 85, 21);
		passwordText.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		add(passwordText);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(865, 334, 218, 26);
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		add(passwordField);
		add(loginButton);
		
		JButton registerButton = new JButton("Crear Cuenta");
		registerButton.setBounds(954, 450, 207, 33);
		registerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				w.goToScreen("register");
			}
		});
		registerButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		add(registerButton);
		
	}
}
