package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Complex {
	WebDriver driver;

	public void captureScreenshot() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\screenshots\\fail.jpg");
		FileUtils.copyFile(src, dest);
	}

	@BeforeTest
	public void initializeDriver() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void test1() throws IOException {
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String jsscript = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		WebElement ele = (WebElement) js.executeScript(jsscript);
		ele.sendKeys("veg pizza");
		captureScreenshot();
	}
}
