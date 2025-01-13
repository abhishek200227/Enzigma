package signuppage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)

public class visitSignupPage extends Baseclass{
@Test
	public void signuppage() {	
	pomfile p1=new pomfile(driver);
	p1.signup_button();
	//signup page should be displayed
	}

}
