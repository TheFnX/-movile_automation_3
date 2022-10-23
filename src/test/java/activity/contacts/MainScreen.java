package activity.contacts;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainScreen {

    public Button addContactButton = new Button(By.id("com.android.contacts:id/floating_action_button"));
    public Button cancelAddAccountButton = new Button(By.id("com.android.contacts:id/left_button"));

    public MainScreen(){
    }

    public boolean isContactDisplayed(String nameContact){
        Label contact = new Label(By.xpath("//android.widget.TextView[@text='"+nameContact+"']"));
        return contact.isControlDisplayed();
    }

    public void selectContactDisplayed(String nameContact){
        Label contact = new Label(By.xpath("//android.widget.TextView[@text='"+nameContact+"']"));
        contact.click();
    }
}
