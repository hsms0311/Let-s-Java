package chapter11;

public class LoginException extends Exception {
	private static final long serialVersionUID = 1L;

	LoginException (String msg) {
		super(msg);
	}
}
