package seleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.restassured.RestAssured;

public class CookieRestAssuredSelenium {

	public static void main(String[] args) {

		List<io.restassured.http.Cookie> coo = RestAssured.given()
				.baseUri("https://naveenautomationlabs.com/opencart/index.php").queryParams("route", "account/register")
				.formParams("customer_group_id", "1", "firstname", "hush", "lastname", "baby", "email",
						"hushbaby@test.com", "telephone", "9876543201", "password", "password", "confirm", "password",
						"newsletter", "0", "agree", "1")
				.log().all().when().post().then().extract().detailedCookies().asList();

		List<org.openqa.selenium.Cookie> selCookie = new ArrayList<Cookie>();

		for (io.restassured.http.Cookie cookie : coo) {
			selCookie.add(new Cookie(cookie.getName(), cookie.getValue(), cookie.getDomain(), cookie.getPath(),
					cookie.getExpiryDate(), cookie.isSecured(), cookie.isHttpOnly()));
		}

		WebDriver driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		for (Cookie c : selCookie) {
			driver.manage().addCookie(c);
		}
		driver.navigate().refresh();

	}

}
