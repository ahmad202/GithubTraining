package GithubWeb;

import Base.BaseClass;
import Pages.HomePages;
import Pages.LoginPages;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {

    @Test
    @Epic("Test flow")
    @Feature("Login form")
    @Story("User enters the wrong password")
    @Owner("Ahmed Alsaeedi")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test that verifies a user can explore the Docs")
    public void LoginPagesMethod() throws InterruptedException {
        LoginPages loginPages = new LoginPages(driver);
        loginPages.enterUsername("testuser");
        loginPages.enterPassword("testpassword");
        loginPages.clickLoginButton();
        Thread.sleep(1000);

    }

    @Test
    @Epic("repo flow")
    @Feature("Login form")
    @Story("User can create new repository")
    @Owner("Ahmed Alsaeedi")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test that verifies a User can create new repository")
    public void addNewRepositoryTest() throws InterruptedException {
       // LoginPagesMethod();

        HomePages HomePages = new HomePages(driver);
        HomePages.clickNewRepoButton();
        HomePages.clickCreateRepoButton();
        HomePages.enterRepoName("");
    }
}

