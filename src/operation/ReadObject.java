package operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject {

	Properties p = new Properties();
 
	public Properties getObjectRepository() throws IOException{
		//Read object repository file
		
		
		File initialFile = new File("D:\\Downloads\\Projects\\HybridFramework\\HybridFramework\\src\\objects\\object.properties");   
	    InputStream stream = new FileInputStream(initialFile);
		
		
	//	InputStream  = new FileInputStream(new File(System.getProperty(key)("user.dir")+"\\src\\objects\\object.properties"));
		//load all objects
		p.load(stream);
		 return p;
	}
	
}
