package clas09;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexecutor {
    public static void main(String[] args) {

        //tell your project where the web
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ;
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='10px dotted pink'", username);


//        find the WebElement
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//        click the login button
        js.executeScript("arguments[0].click();",loginBtn);
    }
}