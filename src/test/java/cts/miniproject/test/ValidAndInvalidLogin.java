package cts.miniproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import cts.miniproject.utility.Baseclass;

public class ValidAndInvalidLogin extends Baseclass {
WebDriver driver;
@Test(description="Valid login",priority=1)
public void validlogin() {
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
}
@Test(description="Invalid login",priority=2)
public void Invalidlogin() {
driver.findElement(By.name("txtUsername")).sendKeys("Admin111");
driver.findElement(By.id("txtPassword")).sendKeys("admin123111");
driver.findElement(By.id("btnLogin")).click();
}
}
