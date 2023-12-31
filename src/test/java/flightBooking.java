import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flightBooking {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/ ");
        driver.manage().window().maximize();

        //currency dropdown
        //handling static dropdowns -if a tagname is  select than its static

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3); //selecting by index
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByVisibleText("AED"); //selecting by text
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());



        //passengers dropdown

        driver.findElement(By.id("divpaxinfo")).click();

//        if we want to add 4,5 product when licking on + button then using loop we will doe this
        Thread.sleep(2000L);

        int  i = 1;
        while (i<4)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }

        Thread.sleep(2000L);


//
//
       driver.findElement(By.id("btnclosepaxoption")).click();
//       dynamic dropdown -loaded based upon user's actions

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value  = 'MAA']")).click();
        driver.findElement(By.xpath("(//a[@value  = 'BLR'])[1]")).click();








//        driver.quit();
    }
}
