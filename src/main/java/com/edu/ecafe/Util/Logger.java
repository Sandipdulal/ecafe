package com.edu.ecafe.Util;


public class Logger implements ILogger{

	public Logger() {
		 
	}

	public void log(String logstring) {
		java.util.logging.Logger.getLogger("eCafeLogger").info(logstring);
		
	}

}
