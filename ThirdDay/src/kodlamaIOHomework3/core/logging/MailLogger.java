package kodlamaIOHomework3.core.logging;

public class MailLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Logged to Mail : " + data);
		
	}

}
