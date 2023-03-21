package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
    public static void main(String[] args) {

            //tell your project where the web
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            //create an instance of webdriver
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();;
            driver.get("https://www.amazon.com/");
            // print all the linksin the amazom.com
        driver.findElements(By.name("a"));


    }
}
