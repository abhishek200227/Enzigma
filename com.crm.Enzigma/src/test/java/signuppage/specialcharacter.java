package signuppage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)

public class specialcharacter extends Baseclass{
	@Test

	public void specialcharacter() throws IOException {
		pomfile p1=new pomfile(driver);
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("./credentials/signup.properties");
		prop.load(fis);
		String specialcharacters=prop.getProperty("specialcharacters");
		p1.signup_button();
		p1.signup_email(specialcharacters);
		p1.signup_termsandconditions();
		p1.signup_proceedbutton();
		//please enter valid email pop up message should be displayed

	}

}
