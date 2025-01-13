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

public class CheckFirstnameLastnamePasswordAndCofirmPasswordTesfield extends Baseclass{
@Test
	public void signuptextfield() throws IOException {
	Scanner sc = new Scanner(System.in);
    
	pomfile p1=new pomfile(driver);
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("./credentials/signup.properties");
	prop.load(fis);
	String email=prop.getProperty("email");
	String Firstname=prop.getProperty("Firstname");
	String lastname=prop.getProperty("lastname");
	String password=prop.getProperty("password");
	String confirmpassword=prop.getProperty("confirmpassword");
    p1.signup_button();
	p1.signup_email(email);
	p1.signup_termsandconditions();
	p1.signup_proceedbutton();	    
	String otp = sc.next();
     p1.signup_opt(otp);
     p1.signup_verifycodebutton();
     p1.signup_firstname(Firstname);
     p1.signup_lastname(lastname);
     p1.signup_password(password);
     p1.signup_confirmpassword(confirmpassword);
     p1.signup_registerbutton();
     //user's profile Dashboard should be displayed
     
	}

}
