package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	private WebDriver driver;
	  @Test
	  public void f() {
		  driver.get("http://www.humancrest.co.jp/");
		  String title = driver.getTitle();
		  Assert.assertTrue(title.contains("株式会社ヒューマンクレスト"));
	  }
	  @BeforeTest
	  public void beforeTest() {
		  driver = new FirefoxDriver();
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }
}
