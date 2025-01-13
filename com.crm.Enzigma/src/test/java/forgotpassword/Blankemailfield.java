package forgotpassword;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)

public class Blankemailfield extends Baseclass{
	@Test

	public void blacnkemailfield() {
		pomfile p1=new pomfile(driver);
		  
		   p1.forgotpassword_button();
		   p1.forgotpassword_email("");
		   p1.forgotpassword_proceedbutton();
		   //please enter email error message should be displayed
	}

}
