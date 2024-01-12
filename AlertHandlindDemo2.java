package com.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlindDemo2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\HemaSDM\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demo.automationtesting.in/Alerts.html");

		wd.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
		Alert alert = wd.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(2000);
		
		wd.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		wd.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		Alert alert1 = wd.switchTo().alert();
		System.out.println(alert1.getText());
		Thread.sleep(3000);
		alert1.accept();
		
		Thread.sleep(2000);

		wd.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		wd.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		Alert alert2 = wd.switchTo().alert();
		alert2.sendKeys("Hema");
		
		
		System.out.println(alert2.getText());
		Thread.sleep(3000);
		alert1.accept();
		
		WebElement msg = wd.findElement(By.xpath("//p[@id='demo1']"));
		String str = msg.getText();
		System.out.println(str);
	}

}
