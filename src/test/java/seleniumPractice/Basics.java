package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeTest
	public void initializeDriver() {
		driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void test1() {
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElement(By.cssSelector("input[value='radio2']")).click();
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		Actions action = new Actions(driver);
		action.sendKeys(autocomplete, "ind").pause(Duration.ofSeconds(2)).perform();
		List<WebElement> country = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
		for (WebElement c : country) {
			if (c.getText().equalsIgnoreCase("India")) {
				c.click();
			}
		}
	}

	@Test
	public void test2() {
		driver.findElement(By.id("dropdown-class-example")).click();
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		List<WebElement> options = select.getOptions();
		for (WebElement e : options) {
			if (e.getDomAttribute("value").equalsIgnoreCase("option3")) {
				e.click();
			}
		}
		driver.findElement(By.id("checkBoxOption2")).click();
	}

	@Test
	public void test3() {
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("openwindow")).click();
		Set<String> windows = driver.getWindowHandles();
		for (String s : windows) {
			driver.switchTo().window(s);
			if (driver.getTitle().contains("QAClick Academy")) {
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("checkBoxOption3")).click();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@Test
	public void test4() {
		Assert.assertEquals(driver.findElement(By.id("displayed-text")).isDisplayed(), true);
		driver.findElement(By.id("hide-textbox")).click();
		Assert.assertEquals(driver.findElement(By.id("displayed-text")).isDisplayed(), false);
		driver.findElement(By.id("show-textbox")).click();
		Assert.assertEquals(driver.findElement(By.id("displayed-text")).isDisplayed(), true);
	}

	@Test
	public void test5() {
		String str = "dp";
		driver.findElement(By.id("name")).sendKeys(str);
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(alert.getText(), "Hello " + str + ", share this practice page and share your knowledge");
		alert.accept();
		driver.findElement(By.id("name")).sendKeys(str);
		driver.findElement(By.id("confirmbtn")).click();
		Assert.assertEquals(alert.getText(), "Hello " + str + ", Are you sure you want to confirm?");
		alert.dismiss();
	}

	@Test
	public void test6() {
		WebElement mh = driver.findElement(By.id("mousehover"));
		Actions action = new Actions(driver);
		action.moveToElement(mh).perform();
		driver.findElement(By.xpath("//a[normalize-space()='Top']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long position = (Long) js.executeScript("return window.pageYOffset;");
		if (position == 0) {
			System.out.println("page is at top");
		} else
			System.out.println("page is not at top");
	}

	@Test
	public void test7() {
		driver.switchTo().frame("courses-iframe");
		Actions action = new Actions(driver);
		action.moveToElement(
				driver.findElement(By.xpath("(//a[@class='dropdown-toggle'][normalize-space()='More'])[1]"))).perform();
	}

	@Test
	public void test8() {
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='gf-BIG']//tr//td/ul/li/a"));
		HttpURLConnection con = null;
		for (WebElement l : links) {
			String url = l.getDomAttribute("href");
			System.out.println(url);
			if (url != null && url.startsWith("http")) {
				try {
					con = (HttpURLConnection) new URL(url).openConnection();
					con.setRequestMethod("HEAD");
					con.connect();
					if (con.getResponseCode() >= 400) {
						System.out.println("Broken link ------ " + l.getText());
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	@Test
	public void test9() throws IOException {
		System.out.println(System.getProperty("user.dir"));
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(0).getLastCellNum();
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + " | ");
			}
			System.out.println();
		}
	}

	@Test
	public void test10() {
		List<WebElement> courses = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/td[2]"));
		for (int i = 0; i < courses.size(); i++) {
			if (courses.get(i).getText().equalsIgnoreCase("Write effective QA Resume that will turn to interview call")) {
				System.out.println(driver
						.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + (i + 2) + "]/td[3]")).getText());
			}
		}
	}

}
