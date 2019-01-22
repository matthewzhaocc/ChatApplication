import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class loginScreen implements KeyListener, ActionListener{
	JFrame frame = new JFrame("login");
	private JTextField username = new JTextField();
	JLabel usernametag = new JLabel("username");
	private JPasswordField password = new JPasswordField();
	JLabel passwordtag = new JLabel("password");
	JLabel welcome = new JLabel("welcome to matthews chat application");
	private String passwordCheck;
	private String usernameCheck;
	public void start() throws Exception{
		frame.setSize(500, 500);
		frame.setLayout(null);
		//set field size
		password.setBounds(300, 150, 150, 30);
		username.setBounds(300, 100, 150, 30);
		//set tag size
		usernametag.setBounds(200, 100, 100, 30);
		passwordtag.setBounds(200, 150, 100, 30);
		//set welcome size
		welcome.setBounds(0, 0, 500, 80);
		Font fon = new Font("Comic Sans MS",Font.PLAIN, 26 );
		welcome.setFont(fon);
		//adding element
		frame.add(usernametag);
		frame.add(passwordtag);
		frame.add(username);
		frame.add(password);
		frame.add(welcome);
		password.addKeyListener(this);
		frame.setVisible(true);
	}
	@SuppressWarnings("deprecation")
	@Override
	public void keyPressed(KeyEvent p) {
		if(p.getKeyCode() == 10) {
			passwordCheck = password.getText();
			System.out.println(passwordCheck);
			password.setText("");
			usernameCheck = username.getText();
			username.setText("");
		}
	}
	@Override
	public void keyReleased(KeyEvent r) {	
	}
	@Override
	public void keyTyped(KeyEvent t) {
	}
	@Override
	public void actionPerformed(ActionEvent pe) {
	}
	public String[] getDetail() {
		String[] info = {usernameCheck,passwordCheck};
		return info;
		
	}
}
