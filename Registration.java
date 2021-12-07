package HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Registration {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Googlebot/2.1 (+http://www.google.com/bot.html)");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://kojinka.ru/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1800, 1000));
        driver.findElement(By.xpath("//li[contains(.,'Регистрация')]")).click();
        driver.findElement(By.name("register[email]")).sendKeys("irinas91113@mail.ru");
        driver.findElement(By.name("register[firstname]")).sendKeys("Ирина");
        driver.findElement(By.name("register[telephone]")).sendKeys("8-911-81-33-19");
        driver.findElement(By.name("register[password]")).sendKeys("qwe123");
        driver.findElement(By.name("register[confirm_password]")).sendKeys("qwe123");
        driver.findElement(By.xpath("//a[contains(.,'Продолжить')]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}