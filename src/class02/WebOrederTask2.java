package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrederTask2 {
    public static void main(String[] args) throws InterruptedException {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        // create an instance of webDriver
        WebDriver driver = new ChromeDriver();


        // navigate

        driver.get(("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"));
        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();

        String title = driver.getTitle();

        if (title.equalsIgnoreCase("Web Orders")) {
            System.out.println("Title is correct!");
        } else {
            System.out.println("Title is incorrect!");
        }

        driver.findElement(By.linkText("Logout")).click();

        driver.quit();
    }
}



