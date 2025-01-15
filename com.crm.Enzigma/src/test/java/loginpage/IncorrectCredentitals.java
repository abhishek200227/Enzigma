package loginpage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)

public class IncorrectCredentitals extends Baseclass {
@Test
	public void incorrectdata() throws IOException {
	 pomfile p1=new pomfile(driver);
	 Properties prop=new Properties();
	  FileInputStream fis=new FileInputStream("./credentials/login.properties");
		prop.load(fis);
		String IncorrectEmail = prop.getProperty("IncorrectEmail");
		String IncorrectPassword = prop.getProperty("IncorrectPassword");
	  p1.login_email(IncorrectEmail);
	  p1.login_password(IncorrectPassword);
	  p1.login_remembermebutton();
	  p1.login_button();

	}

}
