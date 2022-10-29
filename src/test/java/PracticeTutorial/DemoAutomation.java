package PracticeTutorial;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutomation {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        //WebDriver driver=new FirefoxDriver();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        driver.close();

    }
}
