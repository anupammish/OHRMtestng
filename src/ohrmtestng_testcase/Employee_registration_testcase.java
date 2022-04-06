package ohrmtestng_testcase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ohrmtestng_library.Employee;
import ohrmtestng_library.LoginPage;
import utils.Apputils;

public class Employee_registration_testcase extends Apputils {
	String fname;
	String lname;

	@Parameters({ "fstname", "lstname" })

	@Test
	public void checkEmployeRegistration(String fname, String lname) {

		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		lp.isAdminModuleDisplayed();
		Employee emp = new Employee();
		emp.addEmployee(fname, lname);

	}
}
