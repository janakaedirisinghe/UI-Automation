package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginSecurePage.java - class to verify LoginSecure Page functions Created by
 * SrirankanK on 10/3/2018.
 */
public class LoginSecurePage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginSecurePage.class);
    private static By hdrLoginSecureTit = By.xpath("//h2");
    private static By btnLogout = By.xpath("//a[@href='/logout']");
    private static By alertMsg = By.xpath("//div[@id='flash']");

    public static boolean isLoginSecurePageDisplayed() {
        return getDriver().findElement(hdrLoginSecureTit).isDisplayed();
    }

    public static boolean isLoginAlertDisplayed() {
        return getDriver().findElement(alertMsg).isDisplayed();
    }

    public static String getLoginAlertMsg() {
        waiTillVisible(alertMsg,10);
        return getDriver().findElement(alertMsg).getText();
    }

    public static void clickLogout() {
        getDriver().findElement(btnLogout).click();
    }
}
