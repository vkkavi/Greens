package com.greenstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QueEleven {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("kavitha");
		String att = user.getAttribute("value");
		System.out.println(att);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("kavivino");
		String pwd = pass.getAttribute("value");
		System.out.println(pwd);
		driver.quit();
	}

}
