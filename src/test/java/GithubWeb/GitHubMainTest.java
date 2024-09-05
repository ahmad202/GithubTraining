package GithubWeb;

import io.qameta.allure.*;
import Base.BaseClass;
import Pages.GitHubMainPages;
import Pages.LoginPages;
import org.testng.annotations.Test;


public class GitHubMainTest extends BaseClass {

    @Test
    @Epic("Doc flow")
    @Feature("Login form")
    @Story("User enters the wrong password")
    @Owner("Ahmed Alsaeedi")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test that verifies a user can explore the Docs")
    public void sigInMethod() throws InterruptedException {

        GitHubMainPages singIn = new GitHubMainPages(driver);
        singIn.GetUrl();
        singIn.scrollToPosition(0, 1200);
        //singIn.clickDocsLink();
        Thread.sleep(1000);


        LoginPages loginPages = new LoginPages(driver);
        loginPages.OpenGithubUrl();
        loginPages.enterUsername("testuser");
        loginPages.enterPassword("testpassword");
        loginPages.clickLoginButton();
        Thread.sleep(1000);

    }
}
