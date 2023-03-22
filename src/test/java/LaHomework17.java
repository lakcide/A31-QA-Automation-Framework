import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaHomework17 extends BaseTest {
    @Test
    public void Navigation() throws InterruptedException {
        String url = "https://bbb.testpro.io/";
        driver.get(url);
        driver.findElement(By.cssSelector("[type='email']"));
        provideEmail("lakcide@gmail.com");
        driver.findElement(By.cssSelector("[type='password']"));
        providePassword("te$t$tudent");
        clickSubmit();

        String homePageUrl = "https://bbb.testpro.io/#!/home";
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), (homePageUrl));
    }
    @Test
    public void selectSong () {
        driver.findElement(By.cssSelector("[href='#!/songs']")).click();
        driver.findElement(By.xpath("//*[@id=\"songsWrapper\"]/div/div/div[1]/table/tr[2]/td[2]")).click();
    }
    @Test
    public void songToPlaylist () {
        Actions act = new Actions (driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id=\"songsWrapper\"]/div/div/div[1]/table/tr[2]/td[2]"))).perform();
        act.release(driver.findElement(By.cssSelector("[href='#!/playlist/22346']"))).release();
        }

    }




