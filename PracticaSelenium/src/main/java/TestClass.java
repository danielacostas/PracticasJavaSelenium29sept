import Pages.Courses;
import Pages.HomePage;
import Pages.MyProfile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {

    WebDriver driver = new ChromeDriver();

    //Method for setting up the scenario. Has to passed before starting test
    @BeforeTest
    public void setup(){
        //Set webdriver's file location
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\daniel.acosta\\IdeaProjects\\PracticaSelenium");
        //Maximize window
        driver.manage().window().maximize();
        //Delete all cookies
        driver.manage().deleteAllCookies();
    }

    //Create every class instance needed
    HomePage homepage = new HomePage(driver);
    MyProfile myProfile = new MyProfile(driver);
    Courses courses = new Courses(driver);

    //Test login methods
    @Test (priority = 0)
    public void testLogin() throws InterruptedException {
        homepage.openEdureka();
        homepage.clickLogin();
        Thread.sleep(1000);
        homepage.enterEmail("email");
        homepage.enterPassword("pass");
        homepage.login();
        Thread.sleep(5000);
    }

    //Test methods to edit profile
    @Test (priority = 1)
    public void testMyProfile() throws InterruptedException {
        myProfile.openProfile();
        myProfile.clickEditButton();
        Thread.sleep(5000);
        myProfile.editProfile("Nuevo Nombre");
    }

    //Test methods to navigate throughout the courses available
    @Test (priority = 2)
    public void testCourses() {
        myProfile.openCourses();
        courses.openCertificationCourses();
        courses.returnHomePage();
    }

    //Method for logging out
    @AfterTest
    public void logout(){
        myProfile.logout();
    }
}
