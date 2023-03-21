package homeWork;
/*navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
TIP for HW2:
just fill in text boxes or button, no need to deal with other webElements
also u will need a Thread.sleep after clcikng on create new account*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class02T_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Rio");
        driver.findElement(By.name("lastname")).sendKeys("Fan");
        driver.findElement(By.name("reg_email__")).sendKeys("riofan@hotmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("riofan@hotmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("123456");
        driver.findElement(By.name("birthday_month")).sendKeys("Feb");
        driver.findElement(By.id("day")).sendKeys("24");
        driver.findElement(By.name("birthday_year")).sendKeys("2010");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);

        driver.quit();

    }
}
