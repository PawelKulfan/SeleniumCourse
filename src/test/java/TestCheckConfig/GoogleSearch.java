package TestCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();//uruchomienie przeglądarki
        driver.manage().window().maximize();//maksymalizacja na cały ekran
        driver.get("http://www.google.com");//wchodzimy na stronę googla
        driver.findElement(By.id("L2AGLb")).click();//zamknięcie cookiesów, element trzeba aktualizować
        WebElement element = driver.findElement(By.name("q"));//lokalizacja pola wyszukiwania
        element.clear();//czyszczenie pola wyszukiwniaa na wszelki wypadek
        element.sendKeys("Artur Kryszak");//wpisanie wyszukiwanego słowa
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        element.submit();//wysłanie formularze (tu kurat szukaj)
        TimeUnit.MINUTES.sleep(1);//zatrzymuje działanie programu na określonąilość czasu
        //driver.quit();
    }
}
