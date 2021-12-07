package HomeWork3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.interactions.Actions;

public class ChangingPassword  {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Googlebot/2.1 (+http://www.google.com/bot.html)");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://kojinka.ru/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".login")).click();
        driver.findElement(By.name("email")).sendKeys("irinas8@mail.ru");
        driver.findElement(By.name("password")).sendKeys("qwe12345");
        driver.findElement(By.xpath("//input[@value='Войти']")).click();
        driver.findElement(By.linkText("Изменить свой пароль")).click();
        driver.findElement(By.name("password")).sendKeys("qwe123");
        driver.findElement(By.name("confirm")).sendKeys("qwe123");
        driver.findElement(By.xpath("//input[@value='Продолжить']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}