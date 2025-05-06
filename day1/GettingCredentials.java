package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingCredentials {
	public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	System.out.println(title);
	Thread.sleep(3000);
	//Enter the email_address
	driver.findElement(By.id("email")).sendKeys("santhosh1997chandru@gmail.com");
	//Enter the password
	driver.findElement(By.name("pass")).sendKeys("xxxx");
	// Click on Login Button
	driver.findElement(By.name("login")).click();
	
	
		
	}

}
