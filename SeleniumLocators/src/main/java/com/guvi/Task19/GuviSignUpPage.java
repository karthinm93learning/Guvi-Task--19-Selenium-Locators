package com.guvi.Task19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviSignUpPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.guvi.in/register");
		
		WebElement fullName = driver.findElement(By.xpath("//input[@class = 'form-control' and @id = 'name']"));
		/* 
		 *ID = "name"
		 *ClassName = "form-control"
		 *TagName = "input"
		 */
		fullName.sendKeys("Karthi");
		
		WebElement emailBox = driver.findElement(By.xpath("//input[@type = 'email' and @id = 'email']"));
		/* 
		 *ID = "email"
		 *ClassName = ""
		 *TagName = ""
		 */
		emailBox.sendKeys("test@test.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type = 'password' and @id = 'password']"));
		/* 
		 *ID = "password"
		 *ClassName = "form-control password-err"
		 *TagName = ""
		 */
		password.sendKeys("Testing@123");
		
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@autocomplete = 'off' and @id = 'mobileNumber']"));
		/* 
		 *ID = "mobileNumber"
		 *ClassName = "form-control countrycode-left"
		 *TagName = ""
		 */
		mobileNumber.sendKeys("9876543210");

		WebElement signUpButton = driver.findElement(By.xpath("//a[@id = 'signup-btn' and @class = 'btn signup-btn']"));
		/* 
		 *ID = "signup-btn"
		 *ClassName = "btn signup-btn"
		 *TagName = "a"
		 */
		signUpButton.click();
		
		driver.close();
	}

}
