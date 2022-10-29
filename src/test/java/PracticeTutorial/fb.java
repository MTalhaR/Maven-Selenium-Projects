package PracticeTutorial;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();
        //driver.findElement(By.xpath("//a[@role='button']")).click();
        //driver.findElement(By.cssSelector("a[role='button']")).click();
        //driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Talha");;
        //driver.findElement(By.xpath("//*[@id=\"u_w_b_b0\"]")).sendKeys("Talha");
        driver.findElement(By.name("firstname")).sendKeys("Talha");
        driver.findElement(By.name("lastname")).sendKeys("Riaz");
        driver.findElement(By.name("reg_email__")).sendKeys("talhariazmtrb@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("0123456789");
        driver.findElement(By.id("day")).sendKeys("21");
        driver.findElement(By.id("month")).sendKeys("Apr");
        driver.findElement(By.id("year")).sendKeys("1997");
        /*Select dropdown=new Select(driver.findElement(By.id("day")));
        dropdown.selectByValue("21");
        dropdown=new Select(driver.findElement(By.id("month")));
        dropdown.selectByValue("Apr");
        dropdown=new Select(driver.findElement(By.id("year")));
        dropdown.selectByValue("1997");*/
        driver.findElement(By.id("u_w_5_lI")).click();
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        driver.quit();
    }
}
