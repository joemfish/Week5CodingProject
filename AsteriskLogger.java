package Week5CodingProject;

public class AsteriskLogger implements Logger {

	public void log(String log) {
		System.out.println("***" + log + "***\n");
		
	}
	
	public void error(String error) {
		System.out.println("***************");
		System.out.println("***Error:" + error + "***");
		System.out.println("***************\n");
	}
}
