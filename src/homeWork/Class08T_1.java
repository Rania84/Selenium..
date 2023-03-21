package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Class08T_1 {
    public static void main(String[] args) throws InterruptedException {

/*       1.  username=Admin
          password=Hum@nhrm123
        2. click on PIM option
        3. from the table select Any  value of id and click the check box associated with it
        make sure that ur code is dynamic i.e
        changing the id doesnt effect the logic or xpath
*/
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username =driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("//b[text()='PIM']")).click();
       List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        for (int i = 0; i < idColumn.size() ; i++) {
            String id= idColumn.get(i).getText();
            if(id.equalsIgnoreCase("52483A")){
                System.out.println(id +" is located at index # " + (i+1));
                WebElement checkBox=  driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[2]"));
                checkBox.click();
                WebElement nextbtn=driver.findElement(By.xpath("//a[text()='next']"));
                nextbtn.click();




            //  WebElement checkId = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[2]"));





            }

        }


    }

}
/* //   goto syntax HRMS application and login and goto the pim option

        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22);
        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();

//        ------------------------

//        get the employee id 52396A  and click on the checkbox associated with it

        List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
//in order to find the desired id
        for(int i=0;i<ids.size();i++){
            String id = ids.get(i).getText();

            if(id.equalsIgnoreCase("52396A")){

                System.out.println("id is on the row "+i);
//                to click on the partivular checkbox
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkBox.click();


            }
        }
    }
} */