package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {

    public static void main(String[] args) throws InterruptedException {

        /*
         * First Test Case: Go to google.com and search for the term tv
         * 1. Open the browser
         * 2. Navigate to google.com
         * 3. Type in the term inside the search box
         * 4. Click on the search button or hit enter
         * 5. Close the browser
         * */

        //interface             //class
        WebDriver driver = new FirefoxDriver();//Step 1

        driver.manage().window().maximize();

        driver.get("https://amazon.com");//S2

        //driver.manage().deleteAllCookies();

        WebElement element = driver.findElement(By.id("twotabsearchtextbox")); //s3 part 1

        element.click();

        element.sendKeys("TV");//s3 part 2

        element.sendKeys(Keys.ENTER);//s4

        Thread.sleep(5000);//THIS IS NOT RECOMMENDED TO USE

        driver.close(); //s5


    }

}
