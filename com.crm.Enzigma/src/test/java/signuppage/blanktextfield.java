package signuppage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.Enzigma.Baseclass;
import com.crm.pom.pomfile;
@Listeners(com.crm.Enzigma.listnersclass.class)

public class blanktextfield extends Baseclass{
@Test
	public  void blankfield() {
	pomfile p1=new pomfile(driver);
	
	p1.signup_button();
	p1.signup_email("");
	p1.signup_termsandconditions();
	p1.signup_proceedbutton();
	//please enter email pop up message should be displayed

	}

}
