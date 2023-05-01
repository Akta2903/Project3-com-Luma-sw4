package com.Luma.testsuite;

import com.Luma.pages.HomePage;
import com.Luma.pages.Womens_Jackets_Page;
import com.Luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Womens_Jackets_Test extends BaseTest {

    HomePage homepage = new HomePage();
    Womens_Jackets_Page womenpage = new Womens_Jackets_Page();


    @Test
    public void verifyTheSortByProductNameFilter()
    {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.clickOnJackets();
        womenpage.selectProductNameFilter("Product Name");

        Assert.assertEquals(womenpage.getProductList1(),womenpage.getProductList2());
//        womenpage.selectProductNameFilter("Price");
//        Assert.assertEquals(womenpage.getProductPriceList1(),womenpage.getProductPriceList2());
    }
    @Test
    public void verifyTheSortByPriceFilter()
    {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.clickOnJackets();
        womenpage.selectProductNameFilter("Price");
        Assert.assertEquals(womenpage.getProductPriceList1(),womenpage.getProductPriceList2());

    }
}
