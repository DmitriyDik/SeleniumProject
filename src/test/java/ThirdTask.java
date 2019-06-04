import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdTask extends HelloWebDriver {

    @Test
    public void thirdTask() throws InterruptedException {

        driver.get("https://cloud.google.com/products/calculator/");

        driver.switchTo().frame(0);

//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#input_51")));

        WebElement numberOfInstances = driver.findElement(By.cssSelector("#input_51"));
        Thread.sleep(2000);
        numberOfInstances.sendKeys("4");


        WebElement machineType = driver.findElement(By.xpath("//*[@id='select_value_label_47']"));
        machineType.click();
        Thread.sleep(2000);
        WebElement machineTypeValue = driver.findElement(By.id("select_option_210"));
        machineTypeValue.click();


        WebElement gpuCheckBox = driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > .ng-scope > .layout-row .md-container"));
        gpuCheckBox.click();
        Thread.sleep(2000);


        WebElement gpuNumber = driver.findElement(By.id("select_value_label_333"));
        gpuNumber.click();
        Thread.sleep(2000);
        WebElement gpuNumberValue = driver.findElement(By.id("select_option_340"));
        gpuNumberValue.click();


        WebElement gpuType = driver.findElement(By.xpath("//*[@id='select_value_label_334']"));
        gpuType.click();
        Thread.sleep(2000);
        WebElement gpuTypeValue = driver.findElement(By.id("select_option_347"));
        gpuTypeValue.click();


        Thread.sleep(2000);
        WebElement localSSD = driver.findElement(By.xpath("//*[@id='mainForm']/div[1]/div/md-card/md-card-content/div/div[1]/form/div[9]/div[1]"));
        localSSD.click();
        Thread.sleep(2000);
        WebElement localSSDValue = driver.findElement(By.id("select_option_166"));
        localSSDValue.click();


        Thread.sleep(2000);
        WebElement datacenterLocation = driver.findElement(By.id("select_value_label_49"));
        datacenterLocation.click();
        Thread.sleep(2000);
        WebElement datacenterLocationValue = driver.findElement(By.id("select_option_180"));
        datacenterLocationValue.click();


        Thread.sleep(2000);
        WebElement committedUsage = driver.findElement(By.id("select_value_label_50"));
        committedUsage.click();
        Thread.sleep(2000);
        WebElement commutedUsageValue = driver.findElement(By.id("select_option_81"));
        commutedUsageValue.click();


        Thread.sleep(2000);
        WebElement estimateBtn = driver.findElement(By.xpath("//*[@id='mainForm']/div[1]/div/md-card/md-card-content/div/div[1]/form/div[12]/button"));
        estimateBtn.click();


        Thread.sleep(2000);
        WebElement vmClassCheck = driver.findElement(By.xpath("//*[@id='compute']/md-list[1]/md-list-item[2]/div"));
        Assert.assertEquals("VM class: regular", vmClassCheck.getText().trim());


        WebElement instanceTypeCheck = driver.findElement(By.xpath("//*[@id='compute']/md-list[1]/md-list-item[3]/div"));
        Assert.assertEquals("Instance type: n1-standard-8", instanceTypeCheck.getText().trim());


        WebElement regionCheck = driver.findElement(By.xpath("//*[@id='compute']/md-list/md-list-item[4]/div"));
        Assert.assertEquals("Region: Frankfurt", regionCheck.getText().trim());


        WebElement localSSDCheck = driver.findElement(By.xpath("//*[@id='compute']/md-list/md-list-item[5]/div"));
        Assert.assertEquals("Total available local SSD space 2x375 GB", localSSDCheck.getText().trim());


        WebElement termCheck = driver.findElement(By.xpath("//*[@id='compute']/md-list/md-list-item[6]/div"));
        Assert.assertEquals("Commitment term: 1 Year", termCheck.getText().trim());

        //driver.switchTo().defaultContent();

        Thread.sleep(3000);

        driver.quit();

    }
}
