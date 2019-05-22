package com.greenstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuesEight {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement t = driver.findElement(By.xpath("//input[@type='text']"));
		t.sendKeys("Greens velmurugan");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(
				By.xpath("//h3[text()='Greens Technologys: Best Software Training institutes in Chennai with ...']"))
				.click();
		driver.quit();
	}

}
