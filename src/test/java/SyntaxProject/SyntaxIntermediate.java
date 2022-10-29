package SyntaxProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SyntaxIntermediate {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("btn_basic_example")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("btn_inter_example")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Input Form with Validations")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("first_name")).sendKeys("Talha");
        driver.findElement(By.name("last_name")).sendKeys("Riaz");
        driver.findElement(By.name("email")).sendKeys("Talhariaz021@gmail.com");
        driver.findElement(By.name("phone")).sendKeys("03440548100");
        driver.findElement(By.name("address")).sendKeys("H#D-59");
        driver.findElement(By.name("city")).sendKeys("Wah Cantt");
        driver.findElement(By.name("state")).sendKeys("Ohio");
        /*Select obj=new Select(driver.findElement(By.name("state")));
        obj.selectByValue("Ohio");*/
        driver.findElement(By.name("zip")).sendKeys("47040");
        driver.findElement(By.name("website")).sendKeys("www.xyz.com");
        driver.findElement(By.cssSelector("input[value='no']")).click();
        driver.findElement(By.name("comment")).sendKeys("No comments");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Ajax Form Submit")).click();
        driver.findElement(By.id("title")).sendKeys("Talha Riaz");
        driver.findElement(By.id("description")).sendKeys("None");
        driver.findElement(By.id("btn-submit")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.linkText("JQuery Select dropdown")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("country")).sendKeys("Netherlands");
        //Select drpdown=new Select(driver.findElement(By.id("country")));
        //Thread.sleep(1000);
        //drpdown.selectByValue("Netherlands");
        driver.findElement(By.xpath("//option[text()='Alabama']")).click();
        driver.findElement(By.xpath("//option[text()='Arizona']")).click();
        driver.findElement(By.xpath("//select[contains(@class, 'disabled')]")).sendKeys("Puerto Rico");
        driver.findElement(By.xpath("//option[text()='Java']")).click();
        driver.navigate().back();
        driver.findElement(By.linkText("Bootstrap List Box")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='Morbi leo risus']")).click();
        driver.findElement(By.xpath("//button[contains(@class,'right')]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'left')]")).click();
        driver.findElement(By.xpath("//a[@title='select all']")).click();
        driver.findElement(By.xpath("//button[contains(@class,'right')]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'left')]")).click();
        driver.findElement(By.xpath("//a[@title='select all']")).click();
        driver.navigate().back();
        driver.findElement(By.linkText("JQuery List Box")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[text()='Sophia']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[text()='Isabella']")).click();
        driver.findElement(By.xpath("//option[text()='Manuela']")).click();
        driver.findElement(By.xpath("//option[text()='Alice']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Add All']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[text()='Sophia']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Remove']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Remove All']")).click();
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Data List Filter")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("input-search")).sendKeys("Brenda Tree");
        Thread.sleep(1000);
        driver.findElement(By.id("input-search")).sendKeys(Keys.CONTROL ,"a",Keys.DELETE);
        Thread.sleep(1000);
        driver.findElement(By.id("input-search")).sendKeys("980-543-3333");
        Thread.sleep(1000);
        driver.findElement(By.id("input-search")).sendKeys(Keys.CONTROL ,"a",Keys.DELETE);
        Thread.sleep(1000);
        driver.findElement(By.id("input-search")).sendKeys("test6@company.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Progress Bar Modal")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(@class, 'primary')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(@class, 'success')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[contains(@class, 'warning')]")).click();
        Thread.sleep(6000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.linkText("File Download")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("textbox")).sendKeys("Everything is going smoothly");
        driver.findElement(By.id("create")).click();
        driver.findElement(By.id("link-to-download")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
    }
}