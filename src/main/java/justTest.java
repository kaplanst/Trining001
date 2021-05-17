import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class justTest extends Utils {

    @Test
    public void blogLinkTest() {
        driver.get("https://exler.ru");
        driver.findElement(By.xpath("//div[@class='menu']//li[2]")).click();
        String result = driver.getTitle();
        Assert.assertEquals(result, "Блог");
    }
    @Test
    public void kinoLinkTest() {
        driver.get("https://exler.ru");
        driver.findElement(By.xpath("//div[@class='menu']//li[3]")).click();
        String result = driver.getTitle();
        Assert.assertEquals(result, "Кинорецензии");
    }
    @Test
    public void searchTest() {
        driver.get("https://exler.ru");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class ='custom-section hidden-sm hidden-xs']//input")).sendKeys("Обама\n");
        String result = driver.getTitle();
        Assert.assertEquals(result, "Поиск по сайту");
    }
    @Test
    public void logoTest() {
        boolean res;
        driver.get("https://www.exler.ru/");
        if (driver.findElements(By.xpath("//div[@class = 'header-top']")).size() > 0) res = true;
        else res = false;
        Assert.assertTrue(res);
    }
}
