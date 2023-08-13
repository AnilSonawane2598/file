package Utilities_package;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extendreportertestng {
	static ExtentReports extents;

	public static ExtentReports getReportObject() {

		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		String Name = "ExtentReport-" + Timestamp;

		String path = System.getProperty("C:\\Users\\DELL\\eclipse-workspace\\Maven_new_project-ID_0001\\") + Name + " "
				+ ".html";

		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);

		reporter.config().setReportName("Maven extents report");
		reporter.config().setDocumentTitle("Maven execution result");

		extents = new ExtentReports();

		extents.attachReporter(reporter);

		extents.setSystemInfo("QA Automation", "Anil Sonawane");
		extents.setSystemInfo("Suite Name", "Regression/Smoke");

		return extents;
	}

}
