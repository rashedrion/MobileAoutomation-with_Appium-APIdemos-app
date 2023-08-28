package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.PageDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.Utilities;

public class P1_HomePage extends Utilities {

	public P1_HomePage() {
		PageFactory.initElements(new AppiumFieldDecorator(PageDriver.getCurrentDriver()), this);
	}

	/*
	 * @AndroidFindBy(id = "android:id/button1") public WebElement agreeButtonPP;
	 * 
	 * @AndroidFindBy(id =
	 * "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	 * public WebElement permission_allow_whileUsingButton;
	 * 
	 * @AndroidFindBy(id =
	 * "com.android.permissioncontroller:id/permission_allow_button") public
	 * WebElement permission_allow_mediaButton;
	 * 
	 * @AndroidFindBy(id = "com.xiaomi.scanner:id/shutter_button") public WebElement
	 * shutter_button;
	 * 
	 * @AndroidFindBy(id = "android:id/title") public WebElement qrText;
	 */
	
	@AndroidFindBy(id = "com.google.android.dialer:id/dialpad_fab")
	public WebElement dialpad_key;
	
	@AndroidFindBy(id = "com.google.android.dialer:id/zero")
	public WebElement zero_key;
	
	@AndroidFindBy(id = "com.google.android.dialer:id/one")
	public WebElement one_key;
	
	@AndroidFindBy(id = "com.google.android.dialer:id/two")
	public WebElement two_key;
	
	@AndroidFindBy(id = "com.google.android.dialer:id/three")
	public WebElement three_key;
	
	@AndroidFindBy(id = "com.google.android.dialer:id/four")
	public WebElement four_key;
	
	@AndroidFindBy(id = "com.google.android.dialer:id/five")
	public WebElement five_key;
	
	@AndroidFindBy(id = "com.google.android.dialer:id/six")
	public WebElement six_key;
	
	@AndroidFindBy(id = "com.google.android.dialer:id/seven")
	public WebElement seven_key;
	
	@AndroidFindBy(id = "com.google.android.dialer:id/eight")
	public WebElement eight_key;
	
	@AndroidFindBy(id = "com.google.android.dialer:id/nine")
	public WebElement nine_key;
	
	@AndroidFindBy(id = "com.google.android.dialer:id/dialpad_voice_call_button")
	public WebElement dialpad_voice_call_button;
	
	
	public void clikbutton() {
		dialpad_key.click();
		zero_key.click();
		one_key.click();
		eight_key.click();
		two_key.click();
		eight_key.click();
		six_key.click();
		nine_key.click();
		five_key.click();
		nine_key.click();
		three_key.click();
		three_key.click();
		dialpad_voice_call_button.click();
	}

	/*
	 * public void permission_allow() { agreeButtonPP.click();
	 * permission_allow_whileUsingButton.click();
	 * permission_allow_mediaButton.click(); }
	 * 
	 * 
	 * 
	 * public void getTextofQRCode() { System.out.println(qrText.getText()); }
	 */

}
