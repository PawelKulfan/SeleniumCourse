package TestCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byid {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();//uruchomienie przeglądarki
        driver.get("https://hotel-testlab.coderslab.pl/en/");//wchodzimy na stronę googla
        driver.findElement(By.id("hotel_location")).sendKeys("Warsaw");
        /*WebElement hotelLocationField = driver.findElement(By.id("hotel_location"));
        driver.sendKeys("Warsaw"); wersja podzielona na częci z utworzeniem zmiennej typu WebElement o nazwie hotelLocation (zrobiona przy użyciu .var na koncu)*/
        WebElement searchRoomSubmitButton = driver.findElement(By.id("search_room_submit"));//nazwa zmiennej od razu przypomina nam, czego szukamy, potem można o tym zapomnieć
        driver.findElement(By.id("newsletter-input")).sendKeys("test@test.com");
        driver.quit();

    }
}
