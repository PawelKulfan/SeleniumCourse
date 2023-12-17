package TestCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Wejdź na stronę: https://www.google.com
            Wejdź na stronę: https://coderslab.pl/pl
            Cofnij się do strony: https://www.google.com
            Wejdź na stronę: https://mystore-testlab.coderslab.pl/index.php
            Cofnij się do strony: https://www.google.com
            Powróć do strony: https://mystore-testlab.coderslab.pl/index.php
            Odśwież stronę: https://mystore-testlab.coderslab.pl/index.php
*/
public class GoogleSearch3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();//uruchomienie przeglądarki
        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();//zamknięcie cookiesów, element trzeba aktualizować
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        driver.get("https://coderslab.pl/pl");
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        driver.navigate().back();
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        driver.navigate().back();
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        driver.navigate().forward();
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        driver.navigate().refresh();
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        driver.quit();
    }
}
