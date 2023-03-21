package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class03T_1 {
    /*enter the message in the text box
click on show message
Enter value of a
Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL
*/
    public static void main(String[] args) throws InterruptedException {
        //        tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        //        max the window
        driver.manage().window().maximize();
          driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        WebElement element = driver.findElement(By.xpath("//input[@id='user-message']"));
        element.sendKeys(" Tester ");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        WebElement valueA=driver.findElement(By.xpath("//input[@id='sum1']"));
        valueA.sendKeys("500");
        WebElement valueB=driver.findElement(By.xpath("//input[@id='sum2']"));
        valueB.sendKeys("1000");
         WebElement total =driver.findElement(By.xpath("//button[text()='Get Total']"));
         Thread.sleep(1000);
         total.click();
         WebElement sum= driver.findElement(By.xpath("//span[@id='displayvalue']"));

        System.out.println(total.getAttribute("type"));
        System.out.println(sum.getText());


    }
}