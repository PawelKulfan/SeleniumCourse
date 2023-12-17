package TestCheckConfig;
//zidentyfikuj następująca pola/przyciski za pomocą lokalizatora By.name:
//    (pole tekstowe) Hotel Location
//    (przycisk) Search Now
//    (pole tekstowe) Enter your e-mail (pole na dole stron)
//    (przycisk) Subscribe
//Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:
//    Hotel Location - Warsaw
//    Enter your e-mail - test@test.com
//Dodatkowo kliknij przycisk Serach Now, używając metody Submit np.
//findElement(By.name("q")).submit();
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byname {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();//uruchomienie przeglądarki
        driver.get("https://hotel-testlab.coderslab.pl/en/");//wchodzimy na stronę googla
        driver.findElement(By.name("hotel_location")).sendKeys("Warsaw");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("submitNewsletter"));
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        driver.findElement(By.name("search_room_submit")).submit();//submit puszcza formularz bez uruchamiania kodu js pod przyciskiem (czyli np. nie waliduje pól formualrzy)
    }
}
