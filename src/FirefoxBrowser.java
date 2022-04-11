import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Title : " + driver.getTitle());
        System.out.println("CurrentURL : " + driver.getCurrentUrl());
        System.out.println("PageSource : " + driver.getPageSource());
        WebElement userName =  driver.findElement(By.id("user[email]"));
        userName.sendKeys("prime123@gmail.com");
        WebElement passWord = driver.findElement(By.id("user[password]"));
        passWord.sendKeys("prime123");
        driver.close();

    }
}
