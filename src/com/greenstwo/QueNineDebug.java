package com.greenstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QueNineDebug {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		driver.findElement(By.xpath("//span[text()='YouTube']")).click();
		driver.findElement(By.xpath("//span[text()='Play']")).click();
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
	}

}
