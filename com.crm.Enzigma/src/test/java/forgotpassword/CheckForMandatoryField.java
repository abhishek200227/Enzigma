package forgotpassword;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)
public class CheckForMandatoryField extends Baseclass{
@Test
	public void mandatoryfield() {
	pomfile p1=new pomfile(driver);
	 p1.forgotpassword_button();
	  p1.forgotpassword_email1();
	   p1.forgotpassword_proceedbutton();
	   //please enter email pop up should be displayed
		  //asterisk symbol should be use for mandatory text fields.


	}

}
