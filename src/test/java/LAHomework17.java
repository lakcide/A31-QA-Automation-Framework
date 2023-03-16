import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LAHomework17 extends BaseTest {
    @Test
    public void Navigation () throws InterruptedException {
        String url = "https://bbb.testpro.io/";
        driver.get(url);
        Thread.sleep(2000);
        WebElement registrationLink = driver.findElement(By.cssSelector("[id='hel']"));
        registrationLink.click();

        String registrationUrl = "https://bbb.testpro.io/registration.php";
    }

}
