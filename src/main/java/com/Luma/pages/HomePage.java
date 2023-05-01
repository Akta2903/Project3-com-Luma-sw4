package com.Luma.pages;

import com.Luma.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");

    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    By menMenu = By.xpath("//a[@id='ui-id-5']");
    By bottomMenu = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    By gearMenu = By.xpath("//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
    By bags = By.xpath("//span[normalize-space()='Bags']");



    public void mouseHoverOnWomenMenu()
    {
        waitUntilVisibilityOfElementLocated(womenMenu,20);
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops()
    {
        waitUntilVisibilityOfElementLocated(tops,20);
        mouseHoverToElement(tops);
    }

    public void clickOnJackets()
    {
        clickOnElement(jackets);
    }

    public void mouseHoverOnMenMenu()
    {
        waitUntilVisibilityOfElementLocated(menMenu,20);
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottom()
    {
        waitUntilVisibilityOfElementLocated(bottomMenu,20);
        mouseHoverToElement(bottomMenu);
    }

    public void clickOnPant()
    {
        clickOnElement(pants);
    }

    public void mouseHoverOnGearMenu()
    {
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags()
    {
        clickOnElement(bags);
    }

}
