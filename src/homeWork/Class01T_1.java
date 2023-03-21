package homeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 1. launch the browser
 * 2. navigate to amazon web site
 * 3. print out the title and the url in the console
 * 4. close the browser
 */
public class Class01T_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com/");
        String tittle=driver.getTitle();
        System.out.println(tittle);
      String URL= driver.getCurrentUrl();
        System.out.println(URL);
        driver.close();
    }
}
