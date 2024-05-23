package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class BD {
//    @Test
//    public void CheckBox(){
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://practice.cydeo.com/");
//
////        driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
////
////        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
////        boolean isSelectedBefore = checkBox.isSelected();
////        System.out.println(isSelectedBefore);
////
////        checkBox.click();
////
////        boolean isSelectedAfter = checkBox.isSelected();
////        System.out.println(isSelectedAfter);
//
//        driver.quit();
//
//    }
/***  ***/

//    @Test
//    public void DropDown(){
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://practice.cydeo.com/");
//
//        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
//
//
//        Select select = new Select(driver.findElement(By.id("dropdown")));
//        select.selectByVisibleText("Option 1");
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//
//
//        driver.quit();
//
//    }
/*** ***/

//@Test
//public void DropDown(){
//    WebDriver driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("https://practice.cydeo.com/");
//
//    driver.findElement(By.xpath("//a[@href='/frames']")).click();
//
//    driver.findElement(By.xpath("//a[@href='/iframe']")).click();
//
//
//    String ExpectedContent = "Your content goes here.";
//
//    //driver.switchTo().frame(0);
//
//    String ActualContent = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).getText();
//    System.out.println(ActualContent);
//
//    driver.quit();
//
//}
/*** ***/

@Test
public void DropDown(){
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://practice.cydeo.com/");

    driver.findElement(By.xpath("//a[@href='/javascript_alerts']")).click();


    /** JavaScript Alert accept **/
    driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[1]")).click();
    Alert alert = driver.switchTo().alert();
    alert.accept();
    String text = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
    System.out.println(text);

    /** JavaScript Alert dismiss **/
//    driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[2]")).click();
//    Alert alert = driver.switchTo().alert();
//    alert.dismiss();
//    String text = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
//    System.out.println(text);

    /** JavaScript Alert dismiss **/
//    driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[3]")).click();
//    Alert alert = driver.switchTo().alert();
//    alert.sendKeys("Larbi");
//    alert.accept();
//
//    String text = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
//    System.out.println(text);



    driver.quit();

}




}
