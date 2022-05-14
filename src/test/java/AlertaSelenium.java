import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertaSelenium {
    WebDriver driver;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/leeti/OneDrive/%C3%81rea%20de%20Trabalho/Alerts.html");
    }

    @Test
    public void testAlertaSimples() throws InterruptedException {

        driver.findElement(By.xpath(" //button[@class='btn btn-danger']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        Assert.assertEquals("I am an alert box!", alert.getText());
//        alert.dismiss(); // Caso seja com Cancela e OK
        alert.accept();
    }
}
