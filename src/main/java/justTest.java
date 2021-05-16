import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class justTest extends Utils {

    @Test
    public void blogLinkTest() {
        driver.get("http://exler.ru");
        driver.findElement(By.xpath("//div[@class='custom-section-title']/a[@href='/blog/']")).click();
        String result = driver.getTitle();
        Assert.assertEquals(result, "Блог");
    }
}
