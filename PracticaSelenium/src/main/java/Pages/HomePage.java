package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    //Class constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Go to Edureka's home page
    public void openEdureka() {
        driver.get("https://www.edureka.co/");
    }

    //Locator for login button
    By loginButton = By.xpath("/html/body/header/nav/ul/li[4]/span");

    //Locator for email field
    By email = By.xpath("/html/body/div[6]/div/div/div[2]/div[3]/form/div[1]/input");

    //Locator for password field
    By pass = By.xpath("/html/body/div[6]/div/div/div[2]/div[3]/form/div[2]/input");

    //Method to click on login button
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    //Method to enter username
    public void enterEmail(String e){
        driver.findElement(email).sendKeys(e);
    }

    //Method to enter password
    public void enterPassword(String p){
        driver.findElement(pass).sendKeys(p);
    }

    //Method for login
    public void login() {
        driver.findElement(pass).sendKeys(Keys.ENTER);
    }
}
