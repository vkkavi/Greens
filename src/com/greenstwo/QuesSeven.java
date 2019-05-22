package com.greenstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuesSeven {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("kavitha");
		//to get the value
		String att = e.getAttribute("value");
		System.out.println(att);
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("kavivino");
		String pss = p.getAttribute("value");
		System.out.println(pss);
	}

}
