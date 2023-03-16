import org.testng.Assert;
import org.testng.annotations.Test;

public class LAHomework15 extends BaseTest {

    @Test
    public void Navigation() {
//      String url = "https://bbb.testpro.io/";
        String url = "https://testpro.io/";
        Assert.assertEquals(driver.getCurrentUrl(), url);
        driver.get(url);

    }
}
