import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrozers {
    public static void main(String[] args) {
//        for chrome
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/ ");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close(); //it closes only the current tab
//		driver .quit();


//		for firefox

//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://rahulshettyacademy.com/ ");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.close(); //it closes only the current tab
//		driver .quit(); //it quits all tabs at once

    }


}

