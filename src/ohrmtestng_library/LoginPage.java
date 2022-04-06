package ohrmtestng_library;

import org.openqa.selenium.By;

import utils.Apputils;

public class LoginPage extends Apputils {

	public void login(String uid, String pwd) {
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}

	public Boolean isAdminModuleDisplayed() {
		if (driver.findElement(By.linkText("Admin")).isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	public void logout() {
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();

	}

	public boolean isErrMsgDisplayed() {
		String errmsg;
		errmsg = driver.findElement(By.id("spanMessage")).getText();
		System.out.println(errmsg);
		if (errmsg.toLowerCase().contains("invalid")) {
			return true;
		}

		else {
			return false;
		}
	}
}
