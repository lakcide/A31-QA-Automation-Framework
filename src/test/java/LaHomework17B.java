import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaHomework17B extends BaseTest {

    @Test
    public void addSongToPlaylist() throws InterruptedException {

        String newSongAddedText = "Added 1 song into";

        navigateToPage();
        provideEmail("lakcide@gmail.com");
        providePassword("te$t$tudent");
        clickSubmit();
        selectSong();
        Thread.sleep(2000);
        clickAddTo();
        Thread.sleep(2000);
        songToPlaylist("VIP Playlist");
        Assert.assertTrue(getAddedSongNotificationMsg().contains(newSongAddedText));

    }

    public void selectSong () throws InterruptedException {
        driver.findElement(By.cssSelector("[href='#!/songs']")).click();
        Thread.sleep(3000);
       WebElement secondSong = driver.findElement(By.xpath("//*[@id=\"songsWrapper\"]/div/div/div[1]/table/tr[2]/td[2]"));
       secondSong.click();
    }
    public void songToPlaylist (String playlistName) throws InterruptedException {

        WebElement playlistElement = driver.findElement(By.xpath("//section[@id='songsWrapper']//li[contains(text(),'"+playlistName+"')]"));
        playlistElement.click();
        Thread.sleep(2000);
        }
        public void clickAddTo(){
            driver.findElement(By.cssSelector(".btn-add-to")).click();
        }
        public String getAddedSongNotificationMsg(){
            WebElement popUpMsg = driver.findElement(By.cssSelector("div.success.show"));
            return popUpMsg.getText();

        }

    }




