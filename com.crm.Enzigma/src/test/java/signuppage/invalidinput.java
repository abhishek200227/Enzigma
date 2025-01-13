package signuppage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)

public class invalidinput extends Baseclass{
@Test
	public void invalidinput() throws IOException {
		pomfile p1=new pomfile(driver);
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("./credentials/signup.properties");
		prop.load(fis);
		String invalidemail=prop.getProperty("invalidemail");
		p1.signup_button();
		p1.signup_email(invalidemail);
		p1.signup_termsandconditions();
		p1.signup_proceedbutton();
		//Please enter a valid email error message should be displayed

	}

}
