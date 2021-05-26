import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions
{

    @Given("I navigate to url {string}")
    public void i_navigate_to_url(String url)
    {
        BaseTest.homePage.navigateToUrl(url);
    }
    @Then("I should be navigated to home page")
    public void i_should_be_navigated_to_home_page()
    {
        String homePageTitle = BaseTest.registerPage.getPageTitle();
        System.out.println(homePageTitle);
    }
    @When("I click on login link from the navbar")
    public void i_click_on_login_link_from_the_navbar()
    {
         BaseTest.homePage.clickLoginLink();
    }
    @Then("I should be navigated to login page")
    public void i_should_be_navigated_to_login_page()
    {
        BaseTest.homePage.pageRefresh();
        String loginPageTitle = BaseTest.registerPage.getPageTitle();
        System.out.println(loginPageTitle);

    }
    @When("I enter email as {string}")
    public void i_enter_email_as(String em)
    {
         BaseTest.loginPage.enterEmail(em);
    }
    @When("I enter password as {string}")
    public void i_enter_password_as(String pw)
    {
        BaseTest.loginPage.enterPassword(pw);
    }
    @When("I click on login button")
    public void i_click_on_login_button()
    {
       BaseTest.loginPage.clickLoginBtn();
    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {
        String loginPageTitle = BaseTest.registerPage.getPageTitle();
        System.out.println(loginPageTitle);

    }

    @When("I click on the register link from the navbar")
    public void i_click_on_the_register_link_from_the_navbar() {
      BaseTest.homePage.clickRegisterLink();
    }
    @Then("I should be navigated to register page")
    public void i_should_be_navigated_to_register_page() {

        String registerPageTitle = BaseTest.registerPage.getPageTitle();
        System.out.println(registerPageTitle);
        BaseTest.homePage.pageRefresh();
    }
    @When("I select gender as male")
    public void i_select_gender_as_male() {
       BaseTest.registerPage.clickMaleRadioButton();
    }
    @When("I enter firstName lastName email password confirmPassword")
    public void i_enter_first_name_last_name_email_password_confirm_password(io.cucumber.datatable.DataTable dataTable) {
        BaseTest.registerPage.enterFirstName(dataTable.cell(1,0));
        BaseTest.registerPage.enterLastName(dataTable.cell(1,1));
        BaseTest.registerPage.enterEmail(dataTable.cell(1,2));
        BaseTest.registerPage.enterPassword(dataTable.cell(1,3));
        BaseTest.registerPage.enterConfPassword(dataTable.cell(1,4));
    }
    @When("I click on register button")
    public void i_click_on_register_button()
    {
        BaseTest.registerPage.clickRegisterButton();
    }
    @Then("I should be registered successfully")
    public void i_should_be_registered_successfully()
    {
        System.out.println(BaseTest.registerPage.verifyConfMessage());

    }


    @Then("I should see error messages for all the mandatory fields")
    public void i_should_see_error_messages_for_all_the_mandatory_fields() {
        System.out.println("error messages");
    }

}
