import org.testng.Assert;
import org.testng.annotations.Test;

public class LAHomework15 extends BaseTest {

    @Test
    public void Navigation() throws InterruptedException {
//      String url = "https://bbb.testpro.io/";
        String url = "https://testpro.io/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        Thread.sleep(2000);
        driver.quit();
    }
}
