package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_prjt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Eclipse\\\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("MadhubalaRavi");
		driver.findElement(By.id("password")).sendKeys("Madhu11bala");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		Thread.sleep(1000);		
		WebElement findElement1 = driver.findElement(By.xpath("//select[@name='location']"));
		Select a = new Select(findElement1);
		a.selectByValue("London");
		Thread.sleep(1000);
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select b = new Select(findElement2);
		b.selectByValue("Hotel Hervey");
		Thread.sleep(1000);
		WebElement findElement3 = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select c = new Select(findElement3);
		c.selectByVisibleText("Deluxe");
		Thread.sleep(1000);
		WebElement findElement4 = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select d = new Select(findElement4);
		d.selectByValue("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("10/10/2023");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("12/10/2023");
        Thread.sleep(1000);
		WebElement findElement5 = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select e= new Select(findElement5);
		e.selectByValue("2");
		Thread.sleep(1000);
		WebElement findElement6 = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select f= new Select(findElement6);
		f.selectByValue("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Madhubala");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Ravi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("No.122, Narayanaswamy Enclave"+"\n"+"Coimbatore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("7898543223421211");
		Thread.sleep(1000);
		WebElement findElement7 = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select g= new Select(findElement7);
		g.selectByValue("MAST");
		Thread.sleep(1000);
		WebElement findElement8= driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select h= new Select(findElement8);
		h.selectByValue("3");
		Thread.sleep(1000);
		WebElement findElement9 = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select i= new Select(findElement9);
		i.selectByValue("2026");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("381");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Book Now']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='ids[]'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Cancel Selected']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
	}
}
