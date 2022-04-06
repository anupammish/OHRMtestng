package ohrmtestng_testcase;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ohrmtestng_library.LoginPage;
import utils.Apputils;

public class Adminlogin_with_validinput extends Apputils {
	@Parameters({ "adminuid", "adminpwd" })
	@Test
	public void CheckAdminlogin(String uid, String pwd) {
		LoginPage lp = new LoginPage();
		lp.login(uid, pwd);
		boolean res = lp.isAdminModuleDisplayed();
		Assert.assertTrue(res);
		lp.logout();

	}

}
