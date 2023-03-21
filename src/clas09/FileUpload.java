package clas09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class FileUpload {
    public static void main(String[] args) {

        //tell your project where the web
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ;
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile= driver.findElement(By.xpath("//input[@id='file-upload']"));
       // chooseFile.sendKeys("C:\\Users\rmoan\\OneDrive\Desktop\java.txt");
        // i need to rewatch this part
        
    }
}