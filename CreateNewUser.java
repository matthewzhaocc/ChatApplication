import javax.swing.*;
public class CreateNewUser implements newUser{
	JFrame frame = new JFrame();
	
	@Override
	public String Username() {
		String username = JOptionPane.showInputDialog("what do you want your username to be");
		return username;
	}

	@Override
	public String Password() {
		String password = JOptionPane.showInputDialog("what do you want your password to be");
		return password;
	}

	@Override
	public String Location() {
		String location = JOptionPane.showInputDialog("please enter your current location"); 
		return location;
	}
	public String[] init() {
		String[] detail = new String[3];
		detail[0] = Username();
		detail[1] = Password();
		detail[2] = Location();
		return detail;
		
	}
}
