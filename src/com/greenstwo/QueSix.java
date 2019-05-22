package com.greenstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QueSix {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/testimonial.html");
		WebElement chen = driver.findElement(By.xpath("//strong[text()='Sekhar C (Infosys, Chennai) :']"));
		String text = chen.getText();
		System.out.println(text);
	}

}
