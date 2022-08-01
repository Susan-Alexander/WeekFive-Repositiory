package InterfaceAssignment;

public class App {

	public static void main(String[] args) {
		

		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		// Call to the AsteriskLogger class via the Logger Interface

		asteriskLogger.log("Once upon a midnight dreary");
		asteriskLogger.error("While I pondered, weak and weary");	
		
		// Call to the SpacedLogger class via the Logger Interface

		   spacedLogger.log("Over many a qaint and curious");	
		   spacedLogger.error("Volumes of forgotten lore---");
		
	}

}
