package ohrmtestng_library;

import org.openqa.selenium.By;

import utils.Apputils;

public class Employee extends Apputils {

	public boolean addEmployee(String fname, String lname) {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		String expno = driver.findElement(By.id("employeeId")).getAttribute("value");

		driver.findElement(By.id("btnSave")).click();
		String actemp = driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
		if (expno.equals(actemp)) {
			return true;

		} else {
			return false;

		}

	}
}
