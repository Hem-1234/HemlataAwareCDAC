package com.com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LabDemo {
	public static WebDriver d;
	  @Test
	  public void Signup() {
		  WebElement we =d.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]"));
		  we.sendKeys("hema");
		  WebElement we1 = d.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]"));
		  we1.sendKeys("hema1234@gmail.com");
		  WebElement we2 = d.findElement(By.xpath("//button[contains(text(),'Signup')]"));
		  we2.click();
	 
	 d.findElement(By.id("id_gender1")).click();
	 
	 d.findElement(By.name("password")).sendKeys("1234");
	 
	 
	   Select date1 = new Select(d.findElement(By.id("days")));
	date1.selectByValue("18");
	 
	 
	Select date2 = new Select(d.findElement(By.xpath("//select[@id='months']")));
	date2.selectByValue("5");


	Select date3 = new Select(d.findElement(By.xpath("//select[@id='years']")));
	date3.selectByValue("1999");


	d.findElement(By.xpath("//label[contains(text(),'Receive special offers from our partners!')]")).click();


	d.findElement(By.id("first_name")).sendKeys("Hema");

	d.findElement(By.id("last_name")).sendKeys("Borde");

	d.findElement(By.id("company")).sendKeys("Bajaj Finserve");

	d.findElement(By.xpath("//input[@id='address1']")).sendKeys("Merchant Colony");

	d.findElement(By.xpath("//input[@id='address2']")).sendKeys("Chandwad");

	Select country = new Select(d.findElement(By.id("country")));
	country.selectByVisibleText("India");

	d.findElement(By.id("state")).sendKeys("Maharashtra");

	d.findElement(By.xpath("//input[@id='city']")).sendKeys("Chandwad");

	d.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("423101");

	d.findElement(By.name("mobile_number")).sendKeys("1234567890");

	d.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();

	d.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();

	d.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")).sendKeys("kunal123@gmail.com");
	String str = d.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")).getAttribute("value");
	System.out.println(str);
	d.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")).sendKeys("1234");
	String str1 = d.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")).getAttribute("value");
	System.out.println(str1);
	d.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

	 
	System.out.println("-----------------------------------------------------");
	String u = d.getCurrentUrl();
	System.out.println(u);

	System.out.println("-----------------------------------------------------");





	  }
	 
	  @BeforeMethod
	  public void beforeMethod() {
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }

	  @BeforeClass
	  public void beforeClass() {
	  }

	  @AfterClass
	  public void afterClass() {
	  }

	  @BeforeTest
	  public void beforeTest() {
	 
	 System.setProperty("webdriver.chrome.driver",
	"D:\\HemaSDM\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

	d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://automationexercise.com/login");

	  }

	  @AfterTest
	  public void afterTest() {
	  }

	  @BeforeSuite
	  public void beforeSuite() {
	  }

	  @AfterSuite
	  public void afterSuite() {
	  }

	}

