package signuppage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)

public class OTPValidation extends Baseclass{
	@Test

	public void otp() throws IOException {
		Scanner sc = new Scanner(System.in);
	     
		pomfile p1=new pomfile(driver);
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("./credentials/signup.properties");
		prop.load(fis);
		String email=prop.getProperty("email");
		p1.signup_button();
		p1.signup_email(email);
		p1.signup_termsandconditions();
		p1.signup_proceedbutton();	    
		String otp = sc.next();
	     p1.signup_opt(otp);
	     p1.signup_verifycodebutton();
	     
		 

	}

}
