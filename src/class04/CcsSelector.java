package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CcsSelector {
    public static void main(String[] args) throws InterruptedException {


        //        tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        //        max the window
        driver.manage().window().maximize();
        //       go to fb
        driver.get("https://www.facebook.com/");
        //
       WebElement createNewBtn = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
       createNewBtn.click();
       //sleep
        Thread.sleep(2000);
       // fill F name
       WebElement firstName= driver.findElement(By.cssSelector("input[name='firstname']"));
       firstName.sendKeys("riomio");

    }
}