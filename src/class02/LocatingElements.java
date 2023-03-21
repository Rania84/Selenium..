package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        //tell your project where the web
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create an instance of webdriver
        WebDriver driver=new ChromeDriver();
        // open the website facebook.com
        driver.get("https://www.facebook.com/");
        // send in the username
        driver.findElement(By.id("email")).sendKeys("RaniA");
        driver.findElement(By.name("pass")).sendKeys("nhfckhfghcf");

        driver.findElement(By.linkText("Create new account")).click();

         driver.findElement(By.partialLinkText("password?")).click();
         driver.quit();
    }
}
