package com.dem;

import java.net.http.WebSocketHandshakeException;
import java.security.interfaces.DSAPublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class projecttest {
	@Test
	
	public void test()  throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/bus/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("from")).sendKeys("Banglore");
		driver.findElement(By.id("to")).sendKeys("Coimbatore");
		driver.findElement(By.id("date")).sendKeys("07/06/25");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
