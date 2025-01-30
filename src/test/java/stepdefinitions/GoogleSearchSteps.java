package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSearchSteps {
    WebDriver driver;

    @Given("I open the Google homepage")
    public void openGoogleHomePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }

    @When("I search for {string}")
    public void searchForKeyword(String keyword) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(keyword);
        searchBox.submit();
    }

    @Then("I should see search results")
    public void verifySearchResults() {
        WebElement results = driver.findElement(By.id("search"));
        Assert.assertTrue("Search results are displayed", results.isDisplayed());
        driver.quit();
    }
}
