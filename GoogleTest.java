import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {
    @Test
    public void testGoogle() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/");
//
        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys("Selenium");
        textBox.sendKeys(Keys.RETURN);
//        WebElement button  = driver.findElement(By.name("btnK"));
//        textBox.click(); тир
        Thread.sleep(2000); // сделать паузу чтобы браузер загрузился
        WebElement text = driver.findElement(By.xpath("//h3[text()='Selenium']"));
        Assert.assertEquals(text.getText(), "Selenium");
        driver.close();
    }
}
