package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	private Properties prop;

	/**
	 * This method is used to load the properties from config.properties file
	 * @return it returns Properties prop object
	 */
	public Properties init_prop() {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

	}

	
static String path = System.getProperty("user.dir")+"//src//test//resources//config//config.properties";
		
		public static  String setProperty(String name) throws IOException
		{
			File src = new File(path);
			
				Properties prop = new Properties();
			//	String fileName = "./testdata_config/config.properties";
				
				 FileInputStream is = new FileInputStream(src);
				    prop.load(is);
				  String value =  prop.getProperty(name);
				
				  return value;
		}
		}

	
	
	
	




