package loginpage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)
public class BlankField extends Baseclass{
@Test
	public void Blankfield() {
	pomfile p1=new pomfile(driver);
	  p1.login_email("");
	  //"Please enter email" error message should be displayed
	  p1.login_password("");
	  // //"Please enter password" error message should be displayed
	  p1.login_remembermebutton();
	  p1.login_button();

	}

}
