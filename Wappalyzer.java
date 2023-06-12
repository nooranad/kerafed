package pkg;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wappalyzer {
	ChromeDriver driver;
	@Before
	public void wesite()
	{
		driver=new ChromeDriver();
		driver.get("https://www.Wappalyzer.com");
	}
	@Test
	public void sit()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div[3]/div/div/a/span")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"input-2180\"]")).sendKeys("java");
	}

}
