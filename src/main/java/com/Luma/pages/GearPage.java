package com.Luma.pages;

import com.Luma.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {


    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");

    public void clickOnOvernightDuffle()
    {
        clickOnElement(overnightDuffle);
    }
}
