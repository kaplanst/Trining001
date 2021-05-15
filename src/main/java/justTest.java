import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class justTest {

    @BeforeClass
    public void before(){
        WebDriverManager.chromedriver().setup();
    }
    private WebDriver driver;

    @BeforeMethod
    public void beforeTest(){
        driver = new ChromeDriver();
    }
    @Test
//The end
        public void blogLinkTest() {
        driver.get("http://exler.ru");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='custom-section-title']/a[@href='/blog/']")).click();
        String result = driver.getTitle();
        Assert.assertEquals(result, "Блог");
    }

    @AfterMethod
    public void afterTest(){
        driver.quit();
    }
}
