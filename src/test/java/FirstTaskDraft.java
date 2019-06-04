/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTaskDraft {

    public static void firstTask() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://paste.ubuntu.com/");

        WebElement posterField = driver.findElement(By.id("id_poster"));
        posterField.sendKeys("Test");

        WebElement syntaxValue = driver.findElement(By.id("id_syntax"));
        Select syntaxValueSet = new Select(syntaxValue);
        syntaxValueSet.selectByValue("ada");

        WebElement expirationValue = driver.findElement(By.id("id_expiration"));
        Select expirationValueSet = new Select(expirationValue);
        expirationValueSet.selectByVisibleText("A week");

        WebElement contentField = driver.findElement(By.name("content"));
        contentField.sendKeys("Hi Anar");

        Thread.sleep(5000);

        driver.quit();

    }
}*/