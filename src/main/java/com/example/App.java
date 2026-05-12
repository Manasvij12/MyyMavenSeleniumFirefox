package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class App {

    public static void main(String[] args) {

        FirefoxOptions options = new FirefoxOptions();

        // Headless mode for Jenkins
        options.addArguments("--headless");

        // Firefox Snap binary
        options.setBinary("/snap/firefox/current/usr/lib/firefox/firefox");

        WebDriver driver = new FirefoxDriver(options);

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
