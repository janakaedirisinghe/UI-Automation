package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginPage.java - class to verify Login Page functions Created by SrirankanK
 * on 10/3/2018.
 */
public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);
    private static By hdrLoginTit = By.xpath("//h2[text()='Login Page']");
    private static By txtUsername = By.xpath("//input[@id='username']");
    private static By txtPassword = By.xpath("//input[@id='password']");
    private static By btnSubmit = By.xpath("//button[@type='submit']");
    private static By alertMsg=By.xpath("//div[@id='flash']");

    public static  void  setUsername(String username) {
        getDriver().findElement(txtUsername).sendKeys(username);
    }

    public static  void  setPassword(String password) {
        getDriver().findElement(txtPassword).sendKeys(password);
    }

    public static void clickSubmit() {
        getDriver().findElement(btnSubmit).click();
    }

    public static boolean isLoginPageDisplayed() {
        return getDriver().findElement(hdrLoginTit).isDisplayed();
    }

    public static boolean isLoginAlertDisplayed() {
        return getDriver().findElement(alertMsg).isDisplayed();
    }

    public static String getLoginAlertMsg() {
        waiTillVisible(alertMsg,10);
        return getDriver().findElement(alertMsg).getText();
    }


}
