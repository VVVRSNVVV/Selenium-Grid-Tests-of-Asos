package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//footer")
    private WebElement footer;

    @FindBy(xpath = "//a[@icontype='bagUnfilled']")
    private WebElement cartIcon;

    @FindBy(xpath = "//button[@class='_6iPIuvw _2SSHFPv']")
    private WebElement signInButton;


    @FindBy(xpath = "//a[@class='_1336dMe _1uUU2Co _1336dMe _1uUU2Co']")
    private WebElement signInPopup;

    @FindBy(xpath = "//input[@name='Username']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@class='qa-password-textbox']")
    private WebElement passwordField;

    @FindBy(xpath = "//li[@id='loginErrorMessage']")// текст має бути Looks like either your email address or password were incorrect. Wanna try again?
    private WebElement signInError;


    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@class='kH5PAAC']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[contains(@class,'wishlist-button')]//div[contains(@class,'items-count')]")
    private WebElement wishListProductsCount;

    @FindBy(xpath = "//span[@data-bind='text: buttonText']")
    private WebElement addToBag;
    @FindBy(xpath = "//span[@id='selectSizeError']")
    private WebElement errorSize;


    public String singInErrorGetText(){
        return signInError.getText();
    }
    public HomePage(WebDriver driver) {
        super(driver);
    }


    public boolean isHeaderVisible() {
        return header.isDisplayed();
    }

    public boolean isFooterVisible() {
        return footer.isDisplayed();
    }

    public boolean isCartIconVisible() {
        return cartIcon.isDisplayed();
    }



    public boolean isSignInButtonVisible() {
        return signInButton.isDisplayed();
    }

    public void clickSignInButton() {
        signInButton.click();
    }


    public boolean isEmailFieldVisible() {
        return emailField.isDisplayed();
    }

    public boolean isPasswordFieldVisible() {
        return passwordField.isDisplayed();
    }

    public WebElement getSignInPopup() {
        return signInPopup;
    }

    public boolean isSearchFieldVisible() {
        return searchField.isDisplayed();
    }

    public void clickCartButton() {
        cartIcon.click();
    }

    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText, Keys.ENTER);
    }
    public void enterTextToEmail(final String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }
    public void enterTextToPass(final String pass) {
        passwordField.clear();
        passwordField.sendKeys(pass, Keys.ENTER);
    }


    public WebElement getWishListProductsCount() {
        return wishListProductsCount;
    }

    public String getAmountOfProductsInWishList() {
        return wishListProductsCount.getText();
    }
    public void addToBagClick(){
        addToBag.click();
    }
    public String getErrorSize(){
        return errorSize.getText();
    }
    public void setSignInButtonClick(){
        signInButton.click();
    }

}
