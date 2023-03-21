package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        //        tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        //        max the window
        driver.manage().window().maximize();
        //       go to this
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement dropDown= driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select sel=new Select(dropDown);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        // select by  value
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);
        //seleck by visable text
        sel.selectByVisibleText("Friday");

   }
 }
