import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.String.*;

public class LAHomework16 extends BaseTest{

        @Test
        public void Navigation () throws InterruptedException {

            String url = "https://bbb.testpro.io/";
            driver.get(url);
            Thread.sleep(2000);
            WebElement registrationLink = driver.findElement(By.cssSelector("[id='hel']"));
            registrationLink.click();

            String registrationUrl = "https://bbb.testpro.io/registration.php";
            Assert.assertEquals(driver.getCurrentUrl(), registrationUrl);
            Thread.sleep(2000);
            driver.quit();

//            https://bbb.testpro.io/registration.php

        }

    }


