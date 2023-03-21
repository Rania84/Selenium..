package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) throws InterruptedException {
        //        tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        //        max the window
        driver.manage().window().maximize();
        //       go to this
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.switchTo().frame(0);
        WebElement textBox =driver.findElement(By.xpath("//input[@id='name']"));
        textBox.sendKeys("aghjkkhaaklk");
        // get the text clink on fromparent window
        driver.switchTo().defaultContent();
         //        find the text
        WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println("the text is "+text.getText());
        // get the text enter
        driver.switchTo().frame("iframe_a");
        driver.findElement(By.xpath("//label"));
        WebElement getLabel=driver.findElement(By.xpath("//label"));
        System.out.println("the label is: "+getLabel.getText());

        driver.switchTo().defaultContent();
       WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textBox.clear();

    }
}