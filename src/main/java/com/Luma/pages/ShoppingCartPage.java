package com.Luma.pages;

import com.Luma.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCart = By.xpath("//span[@class='base']");

    By cronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By size = By.xpath("//dd[contains(text(),'32')]");
    By color = By.xpath("//dd[contains(text(),'Black')]");

    By overNightDuffleText = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By qtyText = By.cssSelector(".input-text.qty");
    By productPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    By qty = By.cssSelector(".input-text.qty");
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By updatedProductPrice=By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");



    public String getShoppingCart()
    {
        return getTextFromElement(shoppingCart);
    }
    public String getCronusYogaPantText()
    {
        return getTextFromElement(cronusYogaPant);
    }
    public String getSizeText()
    {
        return getTextFromElement(size);
    }
    public String getColorText()
    {
        return getTextFromElement(color);
    }

    public String getOverNightDuffeleText()
    {
        return getTextFromElement(overNightDuffleText);
    }

    public String getQty()
    {
       String q = driver.findElement(qtyText).getAttribute("value");
        return q;
    }

    public String getProductPrice()
    {
        return getTextFromElement(productPrice);
    }

    public void changeQtyOfOverNightDuffle(String newQty)
    {
        driver.findElement(qty).clear();
        sendTextToElement(qty,newQty);
    }
    public void clickOnUpdateShoppingCart()
    {
        clickOnElement(updateShoppingCart);
    }
    public String getUpdatedProductPrice()
    {
        return getTextFromElement(updatedProductPrice);
    }
}
