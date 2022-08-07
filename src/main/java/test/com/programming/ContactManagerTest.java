package test.com.programming;

import com.programming.techie.ContactManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;



//import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ContactManagerTest {
    ContactManager contactManager;

    @BeforeAll
    public  void setupAll(){
        System.out.println("Before All Tests, declaration happens...");
        System.out.println("Current OS we are using is : " + System.getProperty("os.name"));
    }

    @BeforeEach
    @DisplayName("Before each test cases, initialization happens...")
    public void setup_each(){
        System.out.println("Before each test cases, initialization happens...");
        contactManager = new ContactManager();
    }

    @Test
    //@EnabledOnOs(value = OS.MAC, disabledReason = "Enabled only on MAC ")
   //  @EnabledOnOs(value = OS.WINDOWS, disabledReason = "Enabled only on WINDOWS ")
   // @DisplayName("Adding a contact, Enabled only on particular OS")
    public void shouldCreateContact() {
        System.out.println("TEST Method 1 start ");
       // System.out.println("Windows method");
       // contactManager.addContact("Syed", "Umar", "0123456789");
        //   Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        //  Assertions.assertEquals(1,contactManager.getAllContacts().size());
        //  System.out.println(" @Test executed, check if contact created");
        System.out.println("TEST Method 1 end");
    }


    @Test
    //@EnabledOnOs(value = OS.MAC, disabledReason = "Enabled only on MAC ")
    public void randomTest() {
        System.out.println("TEST Method 2 start");
      //  contactManager.addContact("Syed", "Umar", "0123456789");
        // Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        // Assertions.assertEquals(1,contactManager.getAllContacts().size());
        // System.out.println(" @Test executed, check if contact created");
        System.out.println("TEST Method 2 end");
    }

    @AfterEach
    @DisplayName("After each test cases executed")
    public void AfterEach(){
        System.out.println("After Each method called...");
    }




    @AfterAll
     public void AfterAllTest(){
        System.out.println("After All method called...");
        Assertions.assertThrows(RuntimeException.class, () -> contactManager.addContact("Shaa","Shu",""));
    }
}