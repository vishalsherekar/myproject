package Exception;

public class InsufficientBalance extends Exception {
	String msg;
	
	public InsufficientBalance() {
		msg="Balance error";
	}
	public InsufficientBalance(String message) {
		this.msg = message;
	}

	

	public String getMessage() {
		return msg;
	}

}
