package InterfaceAssignment;

public class SpacedLogger implements Logger{

	@Override
	
	//add spaces between each character of the String argument passed into its method
	
	public void log(String log) {
		
		System.out.println(log.replace("", " ").trim() + "\n");
	}
	
	
	@Override
	
	// add spaces between each character of the String argument passed into its method,
	// but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	
	public void error(String error) {
		
		System.out.println("ERROR: " + error.replace("", " ").trim() + "\n");
		
	}
	

}
