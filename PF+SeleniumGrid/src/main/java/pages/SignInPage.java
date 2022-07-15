package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SignInPage extends BasePage{
    @FindBy(xpath = "//a[@class='_1336dMe _1uUU2Co _1336dMe _1uUU2Co']")
    private List<WebElement> singList;

    public SignInPage(WebDriver driver) {
        super(driver);
    }
    public void singListFirstClick() {
        singList.get(0).click();
    }
}
