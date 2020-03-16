package StepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.jayway.restassured.RestAssured;
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
	Assert.assertEquals("https://developer.here.com/", Reusable.driver.getCurrentUrl());
	}
	@Then("^user clicks on \"([^\"]*)\" Link verify status code$")
	public void user_clicks_on_search_Item_Link_verify_Status_Code(String search_Item)
	{
		Reusable.driver.findElement(By.xpath("//div[@class='right-side']/div/ul/li[2]/a[@href='/"+search_Item+"']")).click();
		int responseCode =RestAssured.get(Reusable.driver.getCurrentUrl()).statusCode();
		if(responseCode==200){
			System.out.println("Url is Loaded Properly and getting status Code 200");
		}
		else {
			System.out.println("Url is not Loaded Properly or not getting status Code 200");}
		Assert.assertEquals(200, responseCode);
	
	}
	@Then("^user Validate all the Links \"([^\"]*)\" and Status Code$")
	public void user_Validate_all_the_Links_and_Status_Code(String search_Item) throws  IOException {
	    Reusable.driver.navigate().refresh();
		List <WebElement> link = Reusable.driver.findElements(By.xpath("//a[contains(@href,'"+property_Value("search_linksOf")+"')]"));	
		for (int i=0;i<link.size();i++)
		{ 
			String mainwin = driver.getWindowHandle();
			Actions ac = new Actions(Reusable.driver);
			ac.moveToElement(Reusable.driver.findElement(By.xpath("//div[@class='right-side']/div/ul/li[2]/a[@href='/"+search_Item+"']"))).build().perform();
			link.get(i).click();
			Set<String> childwin = driver.getWindowHandles();
			int childLinkResponseCode =RestAssured.get(Reusable.driver.getCurrentUrl()).statusCode();
			if(childLinkResponseCode==200){
			        boolean angularinitialized = driver.getPageSource().contains("ng");
			if (angularinitialized){
				System.out.println(link.get(i).getText()+" Angular is Initaiated for the Link");
				Reusable.driver.navigate().back();
			}
			else
			{
				System.out.println(link.get(i).getText()+" Angular is not Initaiated for the Link");
				for (String eachwin : childwin) {
					if (!mainwin.equals(eachwin)) {
						driver.switchTo().window(eachwin);
						driver.close();
					}
				}
				driver.switchTo().window(mainwin);
			}
			}
			else 
				System.out.println("Url is not Loaded Properly For"+link.get(i).getText() +"and not getting status Code 200");
		}
	}
	@And("^Close the browser$")
	public void close_the_browser()
	{
		Reusable.driver.quit();
	}
}
