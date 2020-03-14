package StepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ReusablePackage.Reusable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefination extends Reusable {
	WebElement main_link;
	@Given("^user is already on Home Page$")
	public void User_OnLogin() throws IOException
	{
		Reusable.helper_Chrome(property_Value("developerHere_url")); 
	}
	@When("^title of login page is Developer Here$")
	public void title_of_login_page_is_Developer_Here()
	{
	String title=Reusable.driver.getCurrentUrl();
	Assert.assertEquals("https://developer.here.com/", title);
	}
	@Then("^user clicks on \"([^\"]*)\" Link$")
	public void user_clicks_on_search_Item_Link(String search_Item)
	{
		Reusable.driver.findElement(By.xpath("//div[@class='right-side']/div/ul/li[2]/a/span[contains(text(),' "+search_Item+" ')]")).click();

	}
	@Then("^user Validate all the Links \"([^\"]*)\"$")
	public void user_Validate_all_the_Links(String search_Item) throws InterruptedException {
	    Reusable.driver.navigate().refresh();
		List <WebElement> link = Reusable.driver.findElements(By.xpath("//div[@class='field__item']//a[contains(@href,'/documentation')]"));
		for (int i=0;i<link.size();i++)
		{ 
			String mainwin = driver.getWindowHandle();
			Actions ac = new Actions(Reusable.driver);
			ac.moveToElement(Reusable.driver.findElement(By.xpath("//div[@class='right-side']/div/ul/li[2]/a/span[contains(text(),' "+search_Item+" ')]"))).build().perform();
			link.get(i).click();
			Set<String> childwin = driver.getWindowHandles();
			if (childwin.size()>1){
				System.out.println(link.get(i).getText()+" Angular is not Initaiated for the Link");
				for (String eachwin : childwin) {
					if (!mainwin.equals(eachwin)) {
						Reusable.driver.switchTo().window(eachwin);
						Reusable.driver.close();
					}
				}
				Reusable.driver.switchTo().window(mainwin);
			}
			else
			{
				System.out.println(link.get(i).getText()+" Angular is Initaiated for the Link");
				Reusable.driver.navigate().back();
			}
		}
	}
	@And("^Close the browser$")
	public void close_the_browser()
	{
		Reusable.driver.quit();
	}
}
