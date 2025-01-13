package signuppage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)
public class Checkformandatoryfields extends Baseclass {
@Test
	public void mandatoryfield() {
    pomfile p1=new pomfile(driver);
	
	p1.signup_button();
	p1.signup_email1();
	p1.signup_termsandconditions();
	p1.signup_proceedbutton();
	//please enter email pop up message should be displayed
	  //asterisk symbol should be use for mandatory text fields.


	}

}
