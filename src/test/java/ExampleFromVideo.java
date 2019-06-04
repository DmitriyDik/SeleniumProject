/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ExampleFromVideo {

    public static void exampleFromVideo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.seleniumhq.org/");

        WebElement searchInput = driver.findElement(By.id("q"));
        searchInput.sendKeys("selenium java");

        String testString = String.valueOf(driver.findElement(By.id("q")));
        //Assert.assertTrue("selenium java", testString.contains(testString));

        WebElement searchBtn = driver.findElement(By.xpath("//*[@value='Go']"));
        searchBtn.click();

        Thread.sleep(2000);

        driver.quit();
    }
}*/
