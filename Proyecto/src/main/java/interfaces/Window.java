package interfaces;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.google.protobuf.Value.KindCase;

import clases.User;

public class Window extends JFrame {
	private JPanel actualScreen;
	protected User loggedUser;
	
	public Window() {
		this.setSize(500, 500);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setTitle("PlaYInst");
		this.setResizable(true);
		this.setUndecorated(true);
		this.actualScreen = new Login(this);
		this.setContentPane(actualScreen);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void goToScreen(String screenName) {
		this.actualScreen.setVisible(false);
		this.actualScreen = null;
		
		switch (screenName) {
		case "login":
			this.actualScreen = new Login(this);
			break;
		case "register":
			this.actualScreen = new Register(this);
			break;
		case "menu":
			this.actualScreen = new Menu(this);
			break;
		}
		this.actualScreen.setVisible(true);
		this.setContentPane(actualScreen);
		
	}

}
