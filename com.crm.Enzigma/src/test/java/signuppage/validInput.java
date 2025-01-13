package signuppage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)

public class validInput extends Baseclass{
	@Test

	public void validinput() throws IOException {
		pomfile p1=new pomfile(driver);
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("./credentials/signup.properties");
		prop.load(fis);
		String email=prop.getProperty("email");
		p1.signup_button();
		p1.signup_email(email);
		p1.signup_termsandconditions();
		p1.signup_proceedbutton();
		//verification code send successfully pop up message should be displayed.
		

	}

}
