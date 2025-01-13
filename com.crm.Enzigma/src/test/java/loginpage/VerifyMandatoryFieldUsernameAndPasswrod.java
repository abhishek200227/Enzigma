package loginpage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)
public class VerifyMandatoryFieldUsernameAndPasswrod extends Baseclass{
	@Test

	public void mandatoryfield() {
		pomfile p1=new pomfile(driver);
		 p1.login_email1();
		 //please enter email pop up should be displayed
		 p1.login_password1();
		 // //please enter password pop up should be displayed
		  p1.login_remembermebutton();
		  p1.login_button();
		  //asterisk symbol should be use for mandatory text fields.

	}

}
