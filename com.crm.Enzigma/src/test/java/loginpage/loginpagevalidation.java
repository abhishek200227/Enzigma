package loginpage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)

public class loginpagevalidation extends Baseclass{
	@Test
	public void loginpage() throws IOException {
	
	  pomfile p1=new pomfile(driver);
	  Properties prop=new Properties();
	  FileInputStream fis=new FileInputStream("./credentials/login.properties");
		prop.load(fis);
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
	  p1.login_email(email);
	  p1.login_password(password);
	  p1.login_remembermebutton();
	  p1.login_button();
	  //user's profile Dashboard should be displayed
	  
	}
}
