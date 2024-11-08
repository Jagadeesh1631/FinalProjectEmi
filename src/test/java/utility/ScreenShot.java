package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.google.common.io.Files;

import cucumber.hooks.AttachScreenshot;
public class ScreenShot {
	public static void takeScreenshot(WebDriver driver, String name) {
		
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		try {
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			File desc = new File("./src/Output/ScreenShot/img-"+timeStamp+"_"+name+".png");
			Files.copy(src, desc);
			AttachScreenshot.attachScreenshotToReport(desc);
			System.out.println("Snap has been taken Successfully");
		}catch(Exception e) {
			System.out.println("Snap has not taken");
		}
		}

	}
