package activity.contacts;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class ContactScreen {

    public Button editButton = new Button(By.id("com.android.contacts:id/menu_edit"));
    public Button addFavoriteButton = new Button(By.id("com.android.contacts:id/menu_star"));
    public Button moreOptionsButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"More options\"]"));
    public Button linkButton = new Button(By.xpath("//android.widget.TextView[@text='Link']"));
    public Button deleteButton = new Button(By.xpath("//android.widget.TextView[@text='Delete']"));
    public Button confirmDeleteButton = new Button(By.id("android:id/button1"));
    public Button cancelDeleteButton = new Button(By.id("android:id/button2"));
    public Button shareButton = new Button(By.xpath("//android.widget.TextView[@text='Share']"));
    public Button shortcutButton = new Button(By.xpath("//android.widget.TextView[@text='Create shortcut']"));
    public Button setRingtoneButton = new Button(By.xpath("//android.widget.TextView[@text='Set ringtone']"));


    public boolean isContactDisplayed(String completName){
        Label contact = new Label(By.xpath("//android.widget.TextView[@text='"+completName+"']"));
        return contact.isControlDisplayed();
    }
}
