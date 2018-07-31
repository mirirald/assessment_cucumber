package steps;

import base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;


public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void doSomethingBefore() {
        System.out.println("Opening Chrome");

        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        base.Driver = new ChromeDriver();

        // Uncomment to test on mobile
          /*
        Map<String, String> mobileEmulation = new HashMap<>();

        mobileEmulation.put("deviceName", "Nexus 5");


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        base.Driver = new ChromeDriver(chromeOptions);  */
    }

    @After
    public void doSomethingAfter() {

        System.out.println("\nClosing Chrome");

        base.Driver.manage().deleteAllCookies();
        base.Driver.close();
    }

}
