import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTask extends HelloWebDriver{

    @Test
    public void secondTask() throws InterruptedException {

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
        contentField.sendKeys("Hello");

        WebElement pasteBtn = driver.findElement(By.xpath("//input[@type=\'submit\']"));
        pasteBtn.click();

        WebElement finalCheck = driver.findElement(By.xpath("//*[@class=\'n\']"));

        Assert.assertEquals("Hello", finalCheck.getText().trim());


        Thread.sleep(5000);

        driver.quit();

    }
}