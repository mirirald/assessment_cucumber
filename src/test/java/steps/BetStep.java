package steps;

import base.BaseUtil;
import cucumber.api.java8.En;
import pages.FootballCompetitionPage;
import pages.MainPage;
import pages.PremierLeaguePage;

// Steps definitions using lambda expressions

public class BetStep extends BaseUtil implements En {

    private BaseUtil base;


    public BetStep(BaseUtil base) {

        this.base = base;

        Given("^I navigate to the main page$", () -> {
            System.out.println("I should see the main page");
            base.Driver.navigate().to("http://sports.williamhill.com/betting/en-gb");
        });
        And("^I search for Premier League events$", () -> {
            System.out.println("I should see the Premier League events");

            // Using the Page Object for Main Page
            MainPage page = new MainPage(base.Driver);
            page.ClickSearch();
            page.FillSearch(base.Driver);
            page.ClickPremierLeague();
        });
        And("^I select English Premier League$", () -> {
            System.out.println("I should see the English Premier League");

            // Using the Page Object for FootballCompetitionPage
            FootballCompetitionPage page = new FootballCompetitionPage(base.Driver);
            page.ClickPremierLeague();

        });
        And("^I bet on a match for the home team$", () -> {
            // Using the Page Object for PremierLeaguePage
            PremierLeaguePage page = new PremierLeaguePage(base.Driver);
            page.ClickBetHomeTeam();
        });
        And("^I put the stake at \"([^\"]*)\"$", (String stake) -> {
            // If a stake was given using arguments we take it, else it's 0.05
            if (!(System.getProperty("stake") == null)) {

                stake =  System.getProperty("stake");
            }

            System.out.println("stake : " + stake);


            // Using the Page Object for PremierLeaguePage
            PremierLeaguePage page = new PremierLeaguePage(base.Driver);
            page.ClickBetsplit();
            page.FillBetStake(stake);

        });
        Then("^I should have the odds or my bet$", () -> {
            System.out.println("I should the odds");


            // Using the Page Object for PremierLeaguePage
            PremierLeaguePage page = new PremierLeaguePage(base.Driver);

            String odds = page.GetOdds();
            String totReturn = page.GetReturn();
            System.out.println("Odds : " + odds);
            System.out.println("Return : " + totReturn);

        });
    }
}