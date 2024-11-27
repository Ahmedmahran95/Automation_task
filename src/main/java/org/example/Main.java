package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(3000);
//        open Url nopcommerce.com
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(3000);
//        Get element Register page
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);
//        Select Gender
        driver.findElement(By.id("gender-male")).click();
        Thread.sleep(3000);
//        Enter First name
        driver.findElement(By.name("FirstName")).sendKeys("Ahmed");
        Thread.sleep(2000);
//        Enter last name by X-PATH
        driver.findElement(By.xpath("//input[@name=\"LastName\"]")).sendKeys("Mahran");
        Thread.sleep(2000);
//        select by css selectors
        driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]")).click();
        Thread.sleep(2000);
        Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        day.deselectByValue("3");
        Thread.sleep(2000);

        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        month.deselectByValue("4");
        Thread.sleep(2000);

        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.deselectByValue("1950");
        Thread.sleep(2000);

        driver.findElement(By.name("Email")).sendKeys("testing@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("Company")).sendKeys("mahranco");
        Thread.sleep(2000);
        driver.findElement(By.name("Password")).sendKeys("Ahmedyahia95");
        Thread.sleep(2000);
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Ahmedyahia95");
        Thread.sleep(2000);
        driver.findElement(By.className("button-1 register-next-step-button"));
        Thread.sleep(2000);


        driver.quit();

    }
}