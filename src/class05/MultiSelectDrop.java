package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDrop {
    public static void main(String[] args) throws InterruptedException {
        //        tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        //        max the window
        driver.manage().window().maximize();
        //       go to this
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement DD= driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel=new Select(DD);
        sel.selectByValue("New Jersey");
        sel.selectByVisibleText("Ohio");
        Thread.sleep(2000);
        //When it come MultoSelect Drop Down we can also Deselect
        sel.deselectByValue("New Jersey");

        sel.deselectByValue("Ohio");
        System.out.println("the drop down is multiple "+ sel.isMultiple());

    }
}