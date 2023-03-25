import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LaHomework18 extends BaseTest {

    @Test
    public void playASong () throws InterruptedException {
        navigateToPage();
        login();
        playSong();

    }
    public void playSong () {
        WebElement selectSong = driver.findElement(By.cssSelector("[href='#!/songs']"));
        String playlistName = null;
        WebElement playlistElement = driver.findElement(By.xpath("//section[@id='songsWrapper']//li[contains(text(),'"+playlistName+"')]"));
        playlistElement.click();
//        [class="playback"]

    }

}
