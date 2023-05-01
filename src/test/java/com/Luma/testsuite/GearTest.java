package com.Luma.testsuite;

import com.Luma.pages.GearPage;
import com.Luma.pages.HomePage;
import com.Luma.pages.OverNightDuffle;
import com.Luma.pages.ShoppingCartPage;
import com.Luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();
    OverNightDuffle overNightDuffle = new OverNightDuffle();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart()

    {
        homePage.mouseHoverOnGearMenu();
        homePage.clickOnBags();
        gearPage.clickOnOvernightDuffle();
        Assert.assertEquals(overNightDuffle.getOverNightDuffelText(),"Overnight Duffle");
        overNightDuffle.changeQuantityTo3("3");
        overNightDuffle.clickOnAddToCart();
        Assert.assertEquals(overNightDuffle.getAddToCartText(),"You added Overnight Duffle to your shopping cart.");
        overNightDuffle.clickOnShoppingCart();
        Assert.assertEquals(shoppingCartPage.getOverNightDuffeleText(),"Overnight Duffle");
        Assert.assertEquals(shoppingCartPage.getQty(),"3");
        Assert.assertEquals(shoppingCartPage.getProductPrice(),"$135.00");
        shoppingCartPage.changeQtyOfOverNightDuffle("5");
        shoppingCartPage.clickOnUpdateShoppingCart();
        Assert.assertEquals(shoppingCartPage.getUpdatedProductPrice(),"$225.00");



    }
}
