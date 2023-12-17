package TestCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearch2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();//uruchomienie przeglądarki
        //driver.manage().window().maximize();//maksymalizacja na cały ekran
        driver.get("https://coderslab.pl/pl");//wchodzimy na stronę googla
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        driver.get("https://mystore-testlab.coderslab.pl/index.php");//wchodzimy na stronę googla
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        driver.get("https://hotel-testlab.coderslab.pl/en/");//wchodzimy na stronę googla
        driver.quit();
    }
}
