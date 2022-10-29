package SyntaxProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SyntaxAdvanced {
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
        driver.findElement(By.id("btn_advanced_example")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Table Pagination")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("next_link")).click();
        driver.findElement(By.className("next_link")).click();
        driver.findElement(By.className("prev_link")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.linkText("Table Data Search")).click();
        driver.findElement(By.id("task-table-filter")).sendKeys("SEO tags");
        driver.findElement(By.xpath("//button[contains(@class, 'btn')]")).click();
        driver.findElement(By.xpath("//input[@placeholder= '#']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@placeholder= 'Username']")).sendKeys("jacobs");
        driver.findElement(By.xpath("//input[@placeholder= 'First Name']")).sendKeys("Brigade");
        driver.findElement(By.xpath("//input[@placeholder= 'Last Name']")).sendKeys("Dimarison");
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Table Filter")).click();
        driver.findElement(By.xpath("//button[text()='Green']")).click();
        driver.findElement(By.xpath("//button[text()='Orange']")).click();
        driver.findElement(By.xpath("//button[text()='Red']")).click();
        driver.findElement(By.xpath("//button[text()='All']")).click();
        driver.navigate().back();
        driver.findElement(By.linkText("Table Sort & Search")).click();
        Select obj=new Select(driver.findElement(By.name("example_length")));
        obj.selectByIndex(1);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("silva");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
        driver.findElement(By.id("example_next")).click();
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Table Data Download")).click();

        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.linkText("JQuery Download Progress bars")).click();
        driver.findElement(By.id("downloadButton")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//button[text()='Close']")).click();
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Bootstrap Download Progress bar")).click();
        driver.findElement(By.id("cricle-btn")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Drag & Drop Sliders")).click();
        WebElement slide1=driver.findElement(By.xpath("//input[starts-with(@onchange,'range.value')]"));
        Actions actionSlide =new Actions(driver);
        actionSlide.dragAndDropBy(slide1,50,235).perform();
        WebElement slide2=driver.findElement(By.xpath("//input[starts-with(@onchange,'rangeSuccess')]"));
        actionSlide.dragAndDropBy(slide2,50,235).perform();
        WebElement slide3=driver.findElement(By.xpath("//input[starts-with(@onchange,'rangeWarning')]"));
        actionSlide.dragAndDropBy(slide3,-50,235).perform();
        WebElement slide4=driver.findElement(By.xpath("//input[starts-with(@onchange,'rangePrimary')]"));
        actionSlide.dragAndDropBy(slide4,-50,235).perform();
        WebElement slide5=driver.findElement(By.xpath("//input[starts-with(@onchange,'rangeInfo')]"));
        actionSlide.dragAndDropBy(slide5,50,235).perform();
        WebElement slide6=driver.findElement(By.xpath("//input[starts-with(@onchange,'rangeDanger')]"));
        actionSlide.dragAndDropBy(slide6,-20,235).perform();
        /*driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Drag and Drop")).click();
        String [] dragArray={"//span[text()='Draggable 1']","//span[text()='Draggable 2']","//span[text()='Draggable 3']"
                ,"//span[text()='Draggable 4']"};
        Actions actions = new Actions(driver);
        WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
        for (String s : dragArray) {
            WebElement drag = driver.findElement(By.xpath(s));
            actions.dragAndDrop(drag, drop).perform();

            Thread.sleep(3000);}
        WebElement dropArea=driver.findElement(By.id("mydropzone"));
        Actions actionDrag=new Actions(driver);
        WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable 1']"));
        actionDrag.dragAndDrop(drag1,dropArea).perform();
        //actionDrag.dragAndDropBy(drag1,100,0).perform();
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Dynamic Data Loading")).click();
        driver.findElement(By.id("save")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.id("btn_done_example")).click();
        Thread.sleep(2000);
        driver.quit();*/
    }
}
