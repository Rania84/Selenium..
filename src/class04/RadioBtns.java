package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {
        //        tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        //        max the window
        driver.manage().window().maximize();
        //       go to fb
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement femaleBtn= driver.findElement(By.cssSelector("input[value='Female']"));
        //        check if the radio button is enabled
        boolean isEnabelFemale=femaleBtn.isEnabled();
        System.out.println("the radio button femal in enabled "+isEnabelFemale);

//        check if the radio button is Displayed
         boolean isDisplayedFemale=femaleBtn.isDisplayed();
        System.out.println("the radio button femal in displayed "+isEnabelFemale);
//        check if the radio button is Selected
        boolean isSelectedFemale=femaleBtn.isSelected();
        System.out.println("the radio button femal in displayed "+isSelectedFemale);
        // if the radio button is not selected click on it
        if(!isSelectedFemale) {
            femaleBtn.click();
        }
        //        check if the radio button is selected after the click
    isSelectedFemale = femaleBtn.isSelected();
        System.out.println("the status of seletion is"+isSelectedFemale);
    }
}
