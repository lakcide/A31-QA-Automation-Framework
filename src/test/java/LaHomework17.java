import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaHomework17 extends BaseTest {
//    @Test
//    public void Navigation() throws InterruptedException {
//        String url = "https://bbb.testpro.io/";
//        driver.get(url);
//        driver.findElement(By.cssSelector("[type='email']"));
//        provideEmail("lakcide@gmail.com");
//        driver.findElement(By.cssSelector("[type='password']"));
//        providePassword("te$t$tudent");
//        clickSubmit();
//
//        String homePageUrl = "https://bbb.testpro.io/#!/home";
//        Thread.sleep(2000);
//        Assert.assertEquals(driver.getCurrentUrl(), (homePageUrl));
//    }
//    we can remove the test above

    @Test
    public void addSongToPlaylist() throws InterruptedException {//so this will be the homework17 test case
        //hw17 steps

        String newSongAddedText = "Added 1 song into";

//        navigate to koel
        navigateToPage();
//        login to koel
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        //choose song to add
        selectSong();
        Thread.sleep(2000);
        //click Add to button
        clickAddTo();
        Thread.sleep(2000);
        //choose playlist to add the song to
        songToPlaylist("Favorite Playlist");

        Assert.assertTrue(getAddedSongNotificationMsg().contains(newSongAddedText));

    }


//    @Test//remove @Test for methods,
    public void selectSong () throws InterruptedException {
        driver.findElement(By.cssSelector("[href='#!/songs']")).click();
        Thread.sleep(3000);
       WebElement secondSong = driver.findElement(By.xpath("//*[@id=\"songsWrapper\"]/div/div/div[1]/table/tr[2]/td[2]"));
       secondSong.click();
    }
//    @Test//remove @Test for methods
    public void songToPlaylist (String playlistName) throws InterruptedException {

//        act.moveToElement(driver.findElement(By.xpath("//*[@id=\"songsWrapper\"]/div/div/div[1]/table/tr[2]/td[2]"))).perform();
//        act.release(driver.findElement(By.cssSelector("[href='#!/playlist/22346']"))).release();
//        drag drop not working for koel

        WebElement playlistElement = driver.findElement(By.xpath("//section[@id='songsWrapper']//li[contains(text(),'"+playlistName+"')]"));
        playlistElement.click();
        Thread.sleep(2000);
        }

        public void clickAddTo(){
            driver.findElement(By.cssSelector(".btn-add-to")).click();
//            Assert.assertEquals(driver.getPageSource ("Favorite Playlist") );
        }

        public String getAddedSongNotificationMsg(){
        //so we created a method which will return a string, (the pop up message)
            WebElement popUpMsg = driver.findElement(By.cssSelector("div.success.show"));
            return popUpMsg.getText();
        }

    }




