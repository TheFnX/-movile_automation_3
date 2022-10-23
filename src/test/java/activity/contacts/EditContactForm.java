package activity.contacts;

import appiumControl.Button;
import appiumControl.ComboBox;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class EditContactForm {
    //Name
    public TextBox editName = new TextBox(By.xpath("(//android.widget.EditText[@package=\"com.android.contacts\"])[1]"));
    public TextBox editLastName = new TextBox(By.xpath("//android.widget.EditText[2]"));
    //Phone
    public TextBox editPhone = new TextBox(By.xpath("(//android.widget.EditText[@package=\"com.android.contacts\"])[3]"));
    public ComboBox changeTypePhone = new ComboBox(By.xpath("//android.widget.Spinner[@content-desc=\"Phone\"]"));
    public ComboBox changeSelectTypePhone = new ComboBox(By.xpath("(//android.widget.EditText[@package=\"com.android.contacts\"])[1]"));
    //Email
    public TextBox editEmail = new TextBox(By.xpath("(//android.widget.EditText[@package=\"com.android.contacts\"])[5]"));
    public ComboBox changeTypeEmail = new ComboBox(By.xpath("(//android.widget.Spinner[@content-desc=\"Email\"])[1]"));
    public ComboBox changeSelectTypeEmail = new ComboBox(By.xpath("//android.widget.CheckedTextView[1]"));
    //Save
    public Button saveButton = new Button(By.id("com.android.contacts:id/editor_menu_save_button"));
    public Button cancelButton = new Button(By.id("//android.widget.ImageButton[@content-desc=\"Cancel\"]"));

}
