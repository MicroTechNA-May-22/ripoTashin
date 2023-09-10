import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PracticeClass {
    public static void main(String[] args) {

        //Uploaded this project to BitBucket

        WebDriverManager.edgedriver().setup();
        WebDriver driver;
        driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("file:///C:/Users/rahma/OneDrive/Desktop/indexSelectors.html");

        driver.findElement(By.id("fname")).sendKeys("Tashin");
        driver.findElement(By.id("lname")).sendKeys("Rahman");
        driver.findElement(By.xpath("//input[@id='pnumber']")).sendKeys("123456789");
        driver.findElement(By.name("email")).sendKeys("123@testmail.com");

        driver.findElement(By.linkText("Click here to visit Bangladesh")).click();
        driver.navigate().back();

        driver.findElement(By.partialLinkText("USA")).click();
        driver.navigate().back();

        driver.findElement(By.className("submit-btn")).click();

        String Text = driver.findElement(By.id("success")).getText();

        if (Text.contains("Successfully Submited"))
            System.out.println("Suucess");
        else
            System.out.println("Failed");

        driver.close();
    }
}
