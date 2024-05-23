package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.concurrent.TimeUnit;

public class Drop_Down {
//    @Test
//    public void dropDown() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get("https://practice.cydeo.com/");
//        /** Select DropDown **/
////        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
////        Thread.sleep(4000);
////        Select drop = new Select(driver.findElement(By.id("dropdown")));
////        drop.selectByVisibleText("Option 1");
////        Thread.sleep(4000);
//
//        /** Simple DropDown **/
////        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
////        driver.findElement(By.xpath("//*[@id=\"dropdownMenuLink\"]")).click();
////        Thread.sleep(4000);
////        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a[2]")).click();
////        Thread.sleep(4000);
//
//        /** Alert **/
////        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[30]/a")).click();
////        Thread.sleep(4000);
////        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[1]")).click();
////        Thread.sleep(4000);
////        Alert alert = driver.switchTo().alert();
////        alert.accept();
////        Thread.sleep(4000);
////
////        String expectedResult = "You successfully clicked an alert";
////        String actualResult = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
////        Assert.assertEquals(expectedResult,actualResult);
//
//        /** iFrame **/
//        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[23]/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/a")).click();
//        driver.switchTo().frame("mce_0_ifr");
//
//        WebElement iframe = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
//        String actual = iframe.getText();
//        String expected = "Your content goes here.";
//
//        Assert.assertEquals(expected,actual);
//
//        driver.close();
//
//    }

    WebDriver driver;

    @Test
    public void SelectDropDown(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://practice.cydeo.com/");
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();

        WebElement isVisible = driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select select = new Select(isVisible);
        select.selectByVisibleText("Option 1");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        String actualResult = isVisible.getText();
        String expectedResult = "Option 1";

        Assertions.assertEquals(expectedResult,actualResult);

        driver.quit();


    }


}
