package Tests.DemoApp;

import Utils.BrowserUtils;
import Utils.ConstantUtils;
import Utils.GenericUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    String browser = GenericUtils.getBrowserConfig(ConstantUtils.CONFIG_FILE);

    public WebDriver driver = BrowserUtils.getBrowser(browser, ConstantUtils.CONFIG_FILE);;
    String baseUrl = GenericUtils.createBaseUrl(ConstantUtils.CONFIG_FILE);

    @BeforeMethod
    public void beforeTest() {
        System.out.println(baseUrl);
        driver = BrowserUtils.getBrowser(browser, ConstantUtils.CONFIG_FILE);
    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }
}
