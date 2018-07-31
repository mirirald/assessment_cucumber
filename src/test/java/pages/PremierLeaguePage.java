package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

// Page Object Model file

public class PremierLeaguePage {

    public PremierLeaguePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    // Get the WebElement by the XPATH of the object
    @FindBy(how = How.XPATH, using = "//*[@id=\"football\"]/div/div/div[7]/div/div/article[1]/section/button[1]")
    public WebElement btnBetHomeTeam;

    // Get the WebElement by the XPATH of the object
    @FindBy(how = How.XPATH, using = "//*[@id=\"betslip-btn-toolbar\"]/a")
    public WebElement btnBetsplit;

    // Get the WebElement by the XPATH of the object
    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"stake-input\")]")
    public WebElement txtStake;

    // Get the WebElement using ID
    @FindBy(how = How.ID, using = "total-to-return-price")
    public WebElement txtTotalReturn;

    // Get the WebElement by the XPATH of the object
    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"bet-price\")]")
    public WebElement txtOdds;

    // Method to click on this WebElement
    public void ClickBetHomeTeam() {
        btnBetHomeTeam.click();
    }

    // Method to click on this WebElement
    public void ClickBetsplit() {
        btnBetsplit.click();
    }

    // Method to Fill a text field
    public void FillBetStake(String stake) {
        txtStake.sendKeys(stake);
    }

    // Getter for the odds value in the betsplit
    public String GetOdds() {
        return txtOdds.getText();
    }

    // Getter for the return value in the betsplit
    public String GetReturn() {
        return txtTotalReturn.getText();
    }
}
