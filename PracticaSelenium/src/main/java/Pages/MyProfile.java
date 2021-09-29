package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyProfile {

    WebDriver driver;

    //Class constructor
    public MyProfile(WebDriver driver){
        this.driver = driver;
    }

    //Locator for avatar
    By avatar = By.xpath("/html/body/header/nav/div[4]/ul/li[6]/a");

    //Locator for MyProfile tab
    By myProfile = By.xpath("/html/body/header/nav/div[4]/ul/li[6]/ul/li[4]/a");

    //Method to open profile
    public void openProfile() {
        driver.findElement(avatar).click();
        driver.findElement(myProfile).click();
    }

    //Locator for edit button
    By clickEdit = By.className("icon-pr-edit");

    //Method to click edit button
    public void clickEditButton(){
        driver.findElement(clickEdit).click();
    }

    //Locator for name field
    By profileName = By.xpath("/html/body/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/div[2]/div[1]/div[1]/input");

    //Locator for save button
    By saveButton = By.xpath("/html/body/app-root/app-onboarding-user-details/section/div[2]/div/div[1]/button");

    //Method to edit profile and save changes
    public void editProfile(String name){
        driver.findElement(profileName).click();
        driver.findElement(profileName).clear();
        driver.findElement(profileName).sendKeys(name);
        driver.findElement(saveButton).click();
    }

    //Locator for courses button
    By courses = By.xpath("/html/body/app-root/app-onboarding-user-details/app-header/header/nav/div/div[3]/ul/li[2]/div/button");

    //Locator for My Courses tab
    By myCourses = By.xpath("/html/body/app-root/app-onboarding-user-details/app-header/header/nav/div/div[3]/ul/li[2]/div/ul/li[2]/a");

    //Method for open my courses
    public void openCourses(){
        driver.findElement(courses).click();
        driver.findElement(myCourses).click();
    }

    //Locator for logout tab
    By logoutTab = By.xpath("/html/body/header/nav/div[4]/ul/li[6]/ul/li[12]/a");

    //Method to logout
    public void logout() {
        driver.findElement(avatar).click();
        driver.findElement(logoutTab).click();
    }
}
