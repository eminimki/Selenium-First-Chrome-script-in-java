import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/GENC/Desktop/selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://eminimki.com";
        String expectedTitle = "Yakında! - eminimki Blog";
        String actualTitle = "";

        driver.get(baseUrl);

        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test basarili!");
        } else {
            System.out.println("Test basarisiz");
        }
        driver.close();

    }

}