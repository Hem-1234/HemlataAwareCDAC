package com.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\HemaSDM\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demo.guru99.com/v4");

		WebElement we = wd.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
		we.click();
		
		Alert alert = wd.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}
}
