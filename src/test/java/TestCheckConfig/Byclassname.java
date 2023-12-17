package TestCheckConfig;
//zidentyfikuj następująca pola/przyciski za pomocą lokalizatora By.className:
//
//    (przycisk) Sign In
//    (pole tekstowe) Email address
//
//Po zidentyfikowaniu elementów kliknij przycisk Sign In i wpisz dowolny adres e-mail w pole Email address.
//
//Rozpocznij tworzenie nowego użytkownika za pomocą kliknięcia przycisku Create an account (nie musi być z wykorzystaniem lokalizatora By.className)
//Będąc na stronie rejestracji nowego użytkownika (patrz zadanie 3), wyszukaj za pomocą lokalizatorów xpath wszystkie wymagane pola tekstowe oraz wypełnij je dowolnymi danymi:
//
//    First Name
//    Last Name
//    Email
//    Password
//
//Kliknij przycisk Register, który również wyszukaj przy pomocy lokalizatora By.xpath.
//zidentyfikuj następujące pola korzystając z lokalizatora By.cssSelector:
//
//    MY PERSONAL INFORMATION
//    MY ADDRESSES

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byclassname {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();//uruchomienie przeglądarki
        driver.get("https://hotel-testlab.coderslab.pl/en/");//wchodzimy na stronę
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        driver.findElement(By.className("hide_xs")).click();
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        driver.findElement(By.className("form-control")).sendKeys("pawlo2@test.pl");
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(2000);//bardzo ważne czekanie, ponieważ podstrona z formularzem nie jest od razu dostępna, bo jest skrypt przejścia (rozmycie, przejście jedno w drugie itp), trzeba na niego poczekać
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("PawloName");
        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("PawloSurname");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("PawloPass");
        Thread.sleep(2000);//zatrzymuje działanie programu na określonąilość czasu
        driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
        //driver.quit();
        driver.findElement(By.className("a[title='Information']"));
        driver.findElement(By.className("a[href$='adresses']"));










    }
}
