package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


// Page Object Model file

public class MainPage {

    // Constructor to use PF
    public MainPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    // Get the WebElement by is Class name
    @FindBy(how = How.CLASS_NAME, using = "icon-search")
    public WebElement btnSearch;

    // Get the WebElement using ID
    @FindBy(how = How.ID, using = "search-input")
    public WebElement txtSearch;

    // Get the WebElement by the XPATH of the object
    @FindBy(how = How.XPATH, using = "(//*[@id=\"sports-search-quick-links-premier league\"]/i)[2]")
    public WebElement btnPremierLeague;

    // Method to click on this WebElement
    public void ClickSearch() {
        btnSearch.click();
    }

    // Method to Fill a text field and wait for a result
    public void FillSearch(WebDriver driver) {
        txtSearch.sendKeys("Premier League");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // Method to click on this WebElement
    public void ClickPremierLeague() {
        btnPremierLeague.click();
    }
}
