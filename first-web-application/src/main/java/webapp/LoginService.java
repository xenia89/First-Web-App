package webapp;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if(user.equals("Reader")&& password.equals("badger")) {
			return true;
		}
		return false;
	}
}
