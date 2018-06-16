package testSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TestConnexion {

    private WebDriver driver;
    private String baseUrl;


    @Before
    public void setUp () throws Exception {


       // FirefoxOptions options = new FirefoxOptions()
         //       .setProfile(new FirefoxProfile());
        //WebDriver driver = new FirefoxDriver(options);


        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }


    @After
    public void tearDown() throws Exception {

        driver.quit();
    }


    @Test
    public void testConnexion () throws Exception {

        baseUrl = "http://www.seleniumhq.org";
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.get(baseUrl + "/");

        driver.findElement(By.id("menu_documentation")).click();
        driver.findElement(By.linkText("Selenium WebDriver")).click();

        assertEquals("Selenium WebDriver — Selenium Documentation",driver.getTitle());


    }



}
