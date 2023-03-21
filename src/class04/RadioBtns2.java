package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioBtns2 {
    public static void main(String[] args) throws InterruptedException {
        //        tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        //        max the window
        driver.manage().window().maximize();
        //       go to this
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        List<WebElement> radiobtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement radioButton : radiobtns) {
            //  System.out.println(radioBvutton.getAttribute("value")); to print to get the value
            String age = radioButton.getAttribute("value");
            if (age.equalsIgnoreCase("0 - 5")) {
                // Thread.sleep(1000);
                radioButton.click();
            }
        }
    }
}
/*package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButtons2 {
    public static void main(String[] args) {

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

//        goto syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php%22);

//        find all the age group radio buttons
//        the xpath here is common to all the webElements that have age group
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
//        iterate over the list to see ur desired one
        for(WebElement radioBtn: radioBtns){
            String age = radioBtn.getAttribute("value");
//            if the value of the WebElment is 5-10 click on it
            if(age.equalsIgnoreCase("0 - 5")){
                radioBtn.click();
            }

        }
    }
}*/