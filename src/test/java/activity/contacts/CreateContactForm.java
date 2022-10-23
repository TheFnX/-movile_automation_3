package activity.contacts;

import appiumControl.Button;
import appiumControl.ComboBox;
import appiumControl.TextBox;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CreateContactForm {
    //Name
    public TextBox nameTxtBox = new TextBox(By.xpath("//android.widget.EditText[@text='First name']"));
    public TextBox lastNameTxtBox = new TextBox(By.xpath("//android.widget.EditText[@text='Last name']"));
    //Phone
    public TextBox phoneTxtBox = new TextBox(By.xpath("//android.widget.EditText[@text='Phone']"));
    public ComboBox typePhoneTxtBox = new ComboBox(By.xpath("//android.widget.Spinner[@content-desc=\"Phone\"]"));
    public ComboBox selectTypePhoneTxtBox = new ComboBox(By.xpath("//android.widget.CheckedTextView[2]"));
    //Email
    public TextBox emailTxtBox = new TextBox(By.xpath("//android.widget.EditText[@text='Email']"));
    public ComboBox typeEmailTxtBox = new ComboBox(By.xpath("//android.widget.Spinner[@content-desc=\"Email\"]"));
    public ComboBox selectTypeEmailTxtBox = new ComboBox(By.xpath("//android.widget.CheckedTextView[2]"));
    //Save
    public Button saveButton = new Button(By.id("com.android.contacts:id/editor_menu_save_button"));






}
