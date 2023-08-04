package Week5CodingProject;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger fred = new AsteriskLogger();
		fred.log("maybe");
		
		AsteriskLogger henry = new AsteriskLogger();
		henry.error("yes");
		
		SpacedLogger bob = new SpacedLogger();
		bob.log("the situation");
		
		SpacedLogger bobfredhenry = new SpacedLogger();
		bobfredhenry.error("steven");

	}

}
