package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SmokeTests extends BaseTest {


    private static final long DEFAULT_WAITING_TIME = 90;

    @Test
    public void checkMainComponentsOnHomePage() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        assertTrue(getHomePage().isHeaderVisible());
        assertTrue(getHomePage().isFooterVisible());
        assertTrue(getHomePage().isSearchFieldVisible());
        assertTrue(getHomePage().isCartIconVisible());

        assertTrue(getHomePage().isSignInButtonVisible());
        getHomePage().clickSignInButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getSignInPopup());
    }

    @Test
    public void sizeError() throws InterruptedException {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().isSearchFieldVisible();
        getHomePage().enterTextToSearchField("adidas Originals Ozweego Celox trainers in triple black");
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getSearchResultsPage().clickWishListOnFirstProduct();
        getHomePage().addToBagClick();
        assertEquals(getHomePage().getErrorSize(), "Please select from the available colour and size options");
    }

    @Test
    public void logError() throws InterruptedException {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().setSignInButtonClick();
        Thread.sleep(25);
        getSignInPage().singListFirstClick();
        Thread.sleep(300);
        getHomePage().enterTextToEmail("jhg6jhg@gmail.com");
        getHomePage().enterTextToPass("123456785");
        Thread.sleep(300);
        System.out.println(getHomePage().singInErrorGetText());




    }
}
