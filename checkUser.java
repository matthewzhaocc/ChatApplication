
public class checkUser {
	public void check() throws Exception{
		loginScreen ls = new loginScreen();
		String[] info = ls.getDetail();
		info_storage is = new info_storage(null, null, null);
		int size = is.getSize();
	}
}
