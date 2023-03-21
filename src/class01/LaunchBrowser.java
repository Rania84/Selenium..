package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create an instance of webdriver
        WebDriver driver=new ChromeDriver();
        // open the website facebook.com
        driver.get("https://www.facebook.com/");
        //get the current url that is there in the browser
        String URL= driver.getCurrentUrl();
        // print out the url
        System.out.println(URL);
       // get the tittle of the webpage
        String title =driver.getTitle();
        //print the title of the page
        System.out.println("the title of the page is"+title);

        // slow down for 3 seconds
        Thread.sleep(3000);
        //close the browser
        driver.quit();



    }
}
