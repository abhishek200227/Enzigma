package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomfile {
	
	public pomfile(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}
	// WebElements for login page
	private @FindBy(xpath="//input[@name='username']")
	WebElement login_email;
	
	private @FindBy(xpath="//input[@name='password']")
	WebElement login_password;
	
	private @FindBy(xpath="//input[@id='rememberMe']")
	WebElement login_remembermebutton;
	
	private @FindBy(xpath="(//div[@id='staticElement'])[3]")
	WebElement login_button;
	
	public void login_email(String value) {
		login_email.sendKeys(value);
		
	}
	
	public void login_password(String value) {
		login_password.sendKeys(value);
	}
	
	public void login_remembermebutton() {
		login_remembermebutton.click();
	}
	
	public void login_button() {
		login_button.click();
	}
	
	public void login_email1() {
		login_email.click();
		
	}
	
	public void login_password1() {
		login_password.click();
	}
	
	
	
	
	
	// WebElements for forgot password page
	private @FindBy(xpath="//a[text()='Forgot Password?']")
	WebElement forgotpassword_button;
	
	private @FindBy(xpath="(//input[@name='username'])[2]")
	WebElement forgotpassword_email;
	
	private @FindBy(xpath="(//button[@name='undefined'])[4]")
	WebElement forgotpassword_proceedbutton;
	
	public void forgotpassword_button() {
		forgotpassword_button.click();
	}
	
	public void forgotpassword_email(String value) {
		forgotpassword_email.sendKeys(value);
	}
	
	public void forgotpassword_proceedbutton() {
		forgotpassword_proceedbutton.click();
	}
	
	public void forgotpassword_email1() {
		forgotpassword_email.click();
	}
	
	
	
	
	
	
	// WebElements for sign up page
	private @FindBy(xpath="//a[text()='Sign up']")
	WebElement signup_button;
	
	private @FindBy(xpath="(//input[@name='username'])[2]")
	WebElement signup_email;
	
	private @FindBy(xpath="//span[@class='slds-checkbox_faux']")
	WebElement signup_termsandconditions;
	
	private @FindBy(xpath="(//div[@id='staticElement'])[8]")
	WebElement signup_proceedbutton;
	
	private @FindBy(xpath="//input[@name='firstName']")
	WebElement signup_firstname;
	
	private @FindBy(xpath="//input[@name='lastName']")
	WebElement signup_lastname;
	
	private @FindBy(xpath="//input[@name='password']")
	WebElement signup_password;
	
	private @FindBy(xpath="//input[@name='password-confirmpassword']")
	WebElement signup_confirmpassword;
	
	private @FindBy(xpath="(//button[@name='undefined'])[4]")
	WebElement signup_registerbutton;
	
	private @FindBy(xpath="//input[@name='code']")
	WebElement signup_OTP;
	
	private @FindBy(xpath="(//button[@name='undefined'])[3]")
	WebElement signup_verifycodebutton;
	
	public void signup_verifycodebutton() {
		signup_verifycodebutton.click();
	}
	
	public void signup_opt(String value) {
		signup_OTP.sendKeys(value);
	}
	
	public void signup_button() {
		signup_button.click();
	}
	
	public void signup_email(String value) {
		signup_email.sendKeys(value);
	}
	
	public void signup_termsandconditions() {
		signup_termsandconditions.click();
	}
	
	public void signup_proceedbutton() {
		signup_proceedbutton.click();
	}
	
	public void signup_email1() {
		signup_email.click();
	}
	
	
	public void signup_firstname(String value) {
		signup_firstname.sendKeys(value);
	}
	
	public void signup_lastname(String value) {
		signup_lastname.sendKeys(value);
	}
	
	public void signup_password(String value) {
		signup_lastname.sendKeys(value);
	}
	
	public void signup_confirmpassword(String value) {
		signup_lastname.sendKeys(value);
	}
	
	public void signup_registerbutton() {
		signup_registerbutton.click();
	}

}
