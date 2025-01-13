package loginpage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)
public class SpecialCharacters extends Baseclass{
@Test
	public void specialcharacters() throws IOException {
	pomfile p1=new pomfile(driver);
	Properties prop=new Properties();
	  FileInputStream fis=new FileInputStream("./credentials/login.properties");
		prop.load(fis);
		String SpecialEmail = prop.getProperty("email");
		String SpecialPassword= prop.getProperty("password");
	  p1.login_email(SpecialEmail);
	  //please enter valid email pop up should be displayed
	  p1.login_password(SpecialPassword);
	  //invalid mail and password pop up should be displayed
	  p1.login_remembermebutton();
	  p1.login_button();
	}

}
