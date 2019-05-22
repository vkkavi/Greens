package com.greenstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdQues {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/oracle-training.html");
		WebElement txt = driver.findElement(By.xpath("//p[text()='Awarded as the ']"));
		String text = txt.getText();
		System.out.println(text);
		WebElement rate = driver.findElement(By.xpath("//p[text()='Rated as ']"));
		String text2 = rate.getText();
		System.out.println(text2);
		
	}

}
