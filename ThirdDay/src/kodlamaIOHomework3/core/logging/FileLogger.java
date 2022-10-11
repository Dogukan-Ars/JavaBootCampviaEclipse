package kodlamaIOHomework3.core.logging;

public class FileLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Logged to File : " + data);
		
	}

}
