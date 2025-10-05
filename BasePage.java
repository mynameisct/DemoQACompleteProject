package com.demoqa.base.page;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage

{

    protected WebDriver driver;

    protected WebDriverWait wait;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected void click(By element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void Type(WebElement element, String text)
    {
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    protected String getText(WebElement element)
    {
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }

    protected void scrollToElement(By locator)
    {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}