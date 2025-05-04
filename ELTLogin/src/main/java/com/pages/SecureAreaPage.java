package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;

    private By successMessage = By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1");

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}
