package forgotpassword;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)
public class VisitForgotPasswordPage extends Baseclass {
@Test
	public void forgotpasswordpage() {
		pomfile p1=new pomfile(driver);
		p1.forgotpassword_button();
		//forgot password page should be displayed

	}

}
