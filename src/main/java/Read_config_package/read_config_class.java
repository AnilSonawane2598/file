package Read_config_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class read_config_class {
	Properties pro;

	public read_config_class() {
		String path = "C:\\Users\\DELL\\eclipse-workspace\\Maven_new_project_ID_0001\\src\\test\\resources\\config_and_log4_file\\configuration.properties";
		File f = new File(path);
		pro = new Properties();
		try {
			FileInputStream file = new FileInputStream(f);
			try {
				pro.load(file);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (Exception t) {
			System.out.println(t.getMessage());
			t.printStackTrace();
		}
	}

	public String geturl() {
		return pro.getProperty("url");
	}

	public String getusername() {
		return pro.getProperty("userid");
	}

	public String getpassword() {
		return pro.getProperty("passid");
	}

	public String getchromedriver() {
		return pro.getProperty("chromedriver");
	}

	public String getedgedriver() {
		return pro.getProperty("edgedriver");
	}

}
