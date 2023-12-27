import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocateWebelements {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //globally applicable wait here
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/ ");

        driver.findElement(By.id("inputUsername")).sendKeys("usman");

        driver.findElement(By.name("inputPassword")).sendKeys("abc123");

        driver.findElement(By.className("submit")).click();

        System.out.println(driver.findElement(By.cssSelector(".error")).getText());

        //implicit wait - will wait for 5 sec
        driver.findElement(By.linkText("Forgot your password?")).click();

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("usman");

        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("usman_khalid1995@hotmail.com");

//				driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("12222222");
        //parent tagename - child
        driver.findElement(By.xpath("//form//input[3]")).sendKeys("0321321312");

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        System.out.println( driver.findElement(By.cssSelector(".infoMsg")).getText());

        driver.findElement(By.cssSelector(".go-to-login-btn")).click();

        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");



        driver.findElement(By.cssSelector("input[type = \"password\"]")).sendKeys("rahulshettyacademy");

        driver.findElement(By.id("chkboxOne")).click();

        driver.findElement(By.className("submit")).click();

        driver.close();



        driver.quit();

    }

}
