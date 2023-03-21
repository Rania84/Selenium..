package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) {
        //        tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        //        max the window
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        // get all that all links
        List<WebElement> tags= driver.findElements(By.tagName("a"));
        for( WebElement tag:tags){
            String link =tag.getAttribute("href");
            System.out.println(link);


        }
    }
}