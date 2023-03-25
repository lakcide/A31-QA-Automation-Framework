import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LaHomework18 extends BaseTest {

    @Test
    public void playSong () throws InterruptedException {
        navigateToPage();
        login();

        driver.findElement(By.cssSelector("[href='#!/songs']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"songsWrapper\"]/div/div/div[1]/table/tr[2]/td[2]")).click();
        WebElement selectPlayButton = driver.findElement(By.xpath("//span[@data-testid=\"play-btn\"]"));
        selectPlayButton.click();
        Thread.sleep(2000);

//        WebElement playNxtBtn = driver.findElement(By.xpath("//i[@data-testid='play-next-btn']"));
//        playNxtBtn.click();
        WebElement songPlays = driver.findElement(By.xpath("[alt=\"Sound bars\"]"));
//        [class="playback"]
    }

}
