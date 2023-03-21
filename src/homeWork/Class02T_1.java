package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*HW1:
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser */
public class Class02T_1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Mia");
        driver.findElement(By.id("customer.lastName")).sendKeys("Leo");
        driver.findElement(By.name("customer.address.street")).sendKeys(" 2799 Eagle Dr");
        driver.findElement(By.name("customer.address.city")).sendKeys(" fairfax");
        driver.findElement(By.id("customer.address.state")).sendKeys(" Virgina");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(" 20166");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(" 571-879-0909");
        driver.findElement(By.id("customer.ssn")).sendKeys(" 000-000-000");
        driver.findElement(By.id("customer.username")).sendKeys(" Mianemo");
        driver.findElement(By.id("customer.password")).sendKeys(" rgregfng21");
        driver.findElement(By.id("repeatedPassword")).sendKeys(" rgregfng21");
        driver.findElement(By.className("button")).click();
        driver.close();


    }
}