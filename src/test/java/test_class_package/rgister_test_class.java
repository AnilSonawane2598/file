package test_class_package;

import org.testng.annotations.Test;

import Base_class_package.base_class;
import Page_class_package.registration_page_class;
import Utilities_package.retryanlyzer;

public class rgister_test_class extends base_class {
	@Test(retryAnalyzer = retryanlyzer.class)
	public void rgister() {
		registration_page_class rcp = new registration_page_class(driver);
		logger.info("enter id");
		rcp.id(username);
		logger.info("enter pass");
		rcp.pass(password);
		logger.info("click");
		rcp.nac();

	}

}
