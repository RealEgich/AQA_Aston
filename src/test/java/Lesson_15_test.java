
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Lesson_15_test {

    @BeforeAll
    public static void setupClass(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @Test
    void blockTitleTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.mts.by/");
        WebElement title = driver.findElement(By.xpath("//div[@class = 'pay__wrapper']/h2"));
        String txt = "Онлайн пополнение\nбез комиссии";
        assertEquals(txt, title.getText());
        driver.quit();

    }

    @Test
    void blockImageTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.mts.by/");
        WebElement image1 = driver.findElement(By.xpath("//div[@class = 'pay__partners']//img[@alt = ('Visa')]"));
        WebElement image2 = driver.findElement(By.xpath("//div[@class = 'pay__partners']//img[@alt = ('Verified By Visa')]"));
        WebElement image3 = driver.findElement(By.xpath("//div[@class = 'pay__partners']//img[@alt = ('MasterCard')]"));
        WebElement image4 = driver.findElement(By.xpath("//div[@class = 'pay__partners']//img[@alt = ('MasterCard Secure Code')]"));
        WebElement image5 = driver.findElement(By.xpath("//div[@class = 'pay__partners']//img[@alt = ('Белкарт')]"));

        String test_image1 = "Visa";
        assertEquals(test_image1, image1.getAttribute("alt"));
        String test_image2 = "Verified By Visa";
        assertEquals(test_image2, image2.getAttribute("alt"));
        String test_image3 = "MasterCard";
        assertEquals(test_image3, image3.getAttribute("alt"));
        String test_image4 = "MasterCard Secure Code";
        assertEquals(test_image4, image4.getAttribute("alt"));
        String test_image5 = "Белкарт";
        assertEquals(test_image5, image5.getAttribute("alt"));
        driver.quit();
    }

    @Test
    void blockHrefTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.mts.by/");
        if (driver.findElement(By.xpath("//button[contains(text(), 'Отклонить')]")).isDisplayed())
        {
            driver.findElement(By.xpath("//button[contains(text(), 'Отклонить')]")).click();
        }
        WebElement link = driver.findElement(By.xpath("//div[@class = 'pay__wrapper']//a[text() = 'Подробнее о сервисе']"));
        link.click();
        assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));

        driver.quit();
    }
    @Test
    void loginPaymentTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.mts.by/");
        if (driver.findElement(By.xpath("//button[contains(text(), 'Отклонить')]")).isDisplayed())
        {
            driver.findElement(By.xpath("//button[contains(text(), 'Отклонить')]")).click();
        }
        WebElement phoneField = driver.findElement(By.xpath("//div[@id=\"pay-section\"]//input[@id=\"connection-phone\"]"));
        WebElement amountofmoneyField = driver.findElement(By.xpath("//div[@id=\"pay-section\"]//input[@id=\"connection-sum\"]"));

        phoneField.sendKeys("297777777");
        amountofmoneyField.sendKeys("35");

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button[contains(text(), 'Продолжить')]"));
        loginButton.click();

        driver.quit();
    }
}
