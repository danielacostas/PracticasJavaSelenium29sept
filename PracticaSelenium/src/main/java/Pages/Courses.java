package Pages;

import org.openqa.selenium.*;

public class Courses {

    WebDriver driver;

    //Class constructor
    public Courses(WebDriver driver){
        this.driver = driver;
    }

    //Locator for the certification courses button
    By certificationCourses = By.xpath("/html/body/section[5]/div/div[1]/div/ul/li[2]/a");

    //Method for open Certification Courses tab
    public void openCertificationCourses() {
        driver.findElement(certificationCourses).click();
    }

    //Locator for home page button
    By homepage = By.xpath("/html/body/section[2]/div/ul/li[1]/a");

    //Method to return to home page
    public void returnHomePage(){
        driver.findElement(homepage).click();
    }
}
