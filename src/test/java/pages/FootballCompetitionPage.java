package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

// Page Object Model file


public class FootballCompetitionPage {

    public FootballCompetitionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Get the WebElement by the content of the span
    @FindBy(how = How.LINK_TEXT, using = "English Premier League")
    public WebElement lnkPremierLeague;

    // Method to click on this WebElement
    public void ClickPremierLeague() {
        lnkPremierLeague.click();
    }
}
