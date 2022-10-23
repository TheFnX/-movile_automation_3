package cleanTest;


import activity.contacts.ContactScreen;
import activity.contacts.CreateContactForm;
import activity.contacts.EditContactForm;
import activity.contacts.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class ContactTest {

    MainScreen mainScreen = new MainScreen();
    CreateContactForm createContactForm = new CreateContactForm();
    EditContactForm editContactForm = new EditContactForm();
    ContactScreen contactScreen = new ContactScreen();

    @Test
    public void verifyCreateNewContact() throws InterruptedException {
        String nameContact = "Juan";
        String lastName = "Guzman Peredo";
        String phone = "70457842";
        String email = "juan_guz@gmail.com";
        String completName = nameContact + " " + lastName;

        mainScreen.addContactButton.click();
        mainScreen.cancelAddAccountButton.click();

        createContactForm.nameTxtBox.setText(nameContact);
        createContactForm.lastNameTxtBox.setText(lastName);
        createContactForm.phoneTxtBox.setText(phone);
        createContactForm.typePhoneTxtBox.click();
        createContactForm.selectTypePhoneTxtBox.click();

        createContactForm.emailTxtBox.setText(email);
        createContactForm.typeEmailTxtBox.click();
        createContactForm.selectTypeEmailTxtBox.click();
        createContactForm.saveButton.click();
        //Verification
        Thread.sleep(3000);
        Assertions.assertTrue(contactScreen.isContactDisplayed(completName),
                    "ERROR, the contact was not create");
    }

    @AfterEach
    public void verifyEditContact() throws InterruptedException {
        String newNameContact = "Pedro";
        String newLastName = "Zapata Paredes";
        String completName = newNameContact + " " + newLastName;
        //Edit Task
        contactScreen.editButton.click();
        Thread.sleep(3000);
        editContactForm.editName.setText(newNameContact);
        editContactForm.editLastName.setText(newLastName);
        editContactForm.saveButton.click();
        //Verification
        Thread.sleep(3000);
        Assertions.assertTrue(contactScreen.isContactDisplayed(completName),
                "ERROR, the contact was not edit");
    }
    @AfterEach
    public void verifyDeleteContact() throws InterruptedException {
        String newNameContact = "Pedro";
        String newLastName = "Zapata Paredes";
        String nameContact = newNameContact + " " + newLastName;
        contactScreen.moreOptionsButton.click();
        contactScreen.deleteButton.click();
        contactScreen.confirmDeleteButton.click();
        //Verification
        Thread.sleep(3000);
        Assertions.assertFalse(contactScreen.isContactDisplayed(nameContact),
                "ERROR, the contact was not deleted");
    }

    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }

}
