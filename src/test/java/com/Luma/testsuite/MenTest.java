package com.Luma.testsuite;

import com.Luma.pages.HomePage;
import com.Luma.pages.MenPage;
import com.Luma.pages.ShoppingCartPage;
import com.Luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart()
    {
        homePage.mouseHoverOnMenMenu();
        homePage.mouseHoverOnBottom();
        homePage.clickOnPant();
        menPage.mouseHoverOnCronusYogaPant();
        menPage.clickOnSize();
        menPage.clickOnColor();
        menPage.clickOnAddToCart();
        Assert.assertEquals(menPage.getTextAfterAddToCart(),"You added Cronus Yoga Pant to your shopping cart.");
        menPage.clickOnShoppingCart();
        //Assert.assertEquals(shoppingCart.getShoppingCart(),"Cronus Yoga Pant");
        Assert.assertEquals(shoppingCart.getCronusYogaPantText(),"Cronus Yoga Pant");
        Assert.assertEquals(shoppingCart.getSizeText(),"32");
        Assert.assertEquals(shoppingCart.getColorText(),"Black");

    }
}
