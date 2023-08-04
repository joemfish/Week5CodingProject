package Week5CodingProject;

public class SpacedLogger implements Logger {

	public void log(String log) {
		StringBuilder newLog = new StringBuilder();
		for(int i = 0; i < log.length(); i++) {
			if (i > 0) {
				newLog.append(" ");
			}
			newLog.append(log.charAt(i));
		}
		System.out.println(newLog.toString() + "\n");
	}
	
	
	public void error(String error) {
		StringBuilder newLog = new StringBuilder();
		for(int i = 0; i < error.length(); i++) {
			if (i > 0) {
				newLog.append(" ");
			}
			newLog.append(error.charAt(i));
		}
		System.out.println("ERROR: " + newLog.toString() + "\n");
	}
	
}
