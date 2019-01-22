import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class info_storage {
	private File f;
	private FileOutputStream fos;
	private String passwordToStore;
	private String usernameToStore;
	private String locationToStore;
	info_storage(String password, String Username, String location){
		if(Username != null) {
		passwordToStore = password;
		usernameToStore = Username;
		locationToStore = location;
		}
		
	}
	public void init() throws Exception {
		File f = new File("C:\\Users\\Matthew\\Desktop\\chat storage\\info.txt");
		if(!(f.exists())) {
			f.createNewFile();
		}
		fos = new FileOutputStream(f,true);
		byte[] binpassword = new byte[passwordToStore.length()];
		fos.write(binpassword,0,binpassword.length);
		fos.flush();
		fos.close();}
	public int getSize() {
		int size = 0; 
	
		return size;
	}
	public int getUsernameAmount() {
		int usernames = 0;
		return usernames;
	}
	public String[] readAllUsername() {
		String info = null;
		String[] Usernamedata = new String[2000];
		for(int loop2 = 0; loop2 < info.length();loop2++) {
			
				if(info.substring(loop2).equals(",")){
					continue;
				}else {
				Usernamedata[loop2] += info.substring(loop2);
			}
			
		}
		return Usernamedata;
		
	}
	public String[] readAllPassword() {
		String info = null;
		String[] Passworddata = new String[2000];
		for(int loop2 = 0; loop2 < info.length();loop2++) {
			
				if(info.substring(loop2).equals(",")){
					continue;
				}else {
				Passworddata[loop2] += info.substring(loop2);
			}
			
		}
		return Passworddata;
		

		
	}
	public String[][] getAllInfo(){
		String[] passwordData = readAllPassword();
		String[] UsernameData = readAllUsername();
		String[][] info = new String[passwordData.length][UsernameData.length];
		for(int i = 0; i<passwordData.length;i++) {
			info[0][i] = passwordData[i];
		}
		for(int i = 0; i<passwordData.length;i++) {
			info[i][0] = UsernameData[i];
		}
		return info;
		
	}
}
