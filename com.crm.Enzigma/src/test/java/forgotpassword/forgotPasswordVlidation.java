package forgotpassword;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)

public class forgotPasswordVlidation extends Baseclass{
	@Test
	public void forgotpassword() throws IOException {
	   pomfile p1=new pomfile(driver);
	   Properties prop=new Properties();
		  FileInputStream fis=new FileInputStream("./credentials/forgotpassword.properties");
			prop.load(fis);
			String email = prop.getProperty("email");
	   p1.forgotpassword_button();
	   p1.forgotpassword_email(email);
	   p1.forgotpassword_proceedbutton();
	   //verification code should be send to register mail
	}
}
