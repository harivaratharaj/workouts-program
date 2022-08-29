package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class selenium_all_topics {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://demoqa.com/automation-practice-form");
driver.manage().window().maximize();
driver.findElement(By.cssSelector("input#firstName")).sendKeys("harivaratharaj");
driver.findElement(By.cssSelector("input#lastName")).sendKeys("v");
driver.findElement(By.cssSelector("input#userEmail")).sendKeys("harivaratharajvelmurugan");
WebElement male=driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
male.click();
driver.findElement(By.cssSelector("input[placeholder=\"Mobile Number\"]")).sendKeys("8667734052");
WebElement sports=driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
sports.click();
driver.findElement(By.cssSelector("textarea[cols=\"20\"]")).sendKeys("75/128, soudamman kovil street, swamichettipalayam, coimbatore-641047");

driver.findElement(By.cssSelector("input#uploadPicture")).sendKeys("C:\\screenshots\\youtube3.jpeg");
File sr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(sr,new File("C:\\screenshots\\ToolsQA.png"));
Thread.sleep(3000);
driver.close();
	}

}
