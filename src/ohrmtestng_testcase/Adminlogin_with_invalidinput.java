package ohrmtestng_testcase;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ohrmtestng_library.LoginPage;

public class Adminlogin_with_invalidinput {

	@Parameters({ "adminuid", "adminpwd" })
	@Test
	public void CheckAdminlogin(String uid, String pwd) {
		LoginPage lp = new LoginPage();
		lp.login(uid, pwd);
		boolean res = lp.isErrMsgDisplayed();
		Assert.assertTrue(res);
		

	}
}