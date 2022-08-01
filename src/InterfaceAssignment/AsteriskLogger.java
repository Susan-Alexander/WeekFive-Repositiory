package InterfaceAssignment;

public class AsteriskLogger implements Logger{

	
	@Override
	
	// Print out the string with leading and trailing *'s
	
	public void log(String log) {

		System.out.println("***" + log + "***\n");
		
	}

	
	@Override
	
	//Print out the error string surrounded by *'s
	
    public void error(String error) {
		

		astriskLine(error);
		System.out.println("***Error: " + error + "***");
		astriskLine(error);
		
	}
	// Asterick line Method
	public void astriskLine(String var) {
		 for (int i = -13; i < var.length() ; i++) {
			 System.out.print("*");
		 }
	         System.out.print("\n"); 
	}
	
}
	        


