package com.eurotech.pages;

import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class PostsPage extends BasePage{

    @FindBy(id = "post-form-title")
    public WebElement titleInput;

    @FindBy(id = "post-form-textarea")
    public WebElement postInput;

    @FindBy(css = "#post-form-btn")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Post Created']")
    public WebElement postCreatedMessage;

    public void postComment(String titleText, String postText) {
        titleInput.sendKeys(titleText);
        postInput.sendKeys(postText);
        submitButton.click();
        Assert.assertEquals(postCreatedMessage.getText(),"Post Created","verifying whether the post is created successfully");
    }

  /* mein Versuch
    @FindBy(xpath = "//a[@class='btn btn-light']")
    public List<WebElement> dashboardList;

    public void navigateSubMenu(String subMenuName){
        BrowserUtils.hover(dashboardList.get(2));
        Driver.get().findElement(By.xpath("//span[text()='"+subMenuName+"']")).click();
    }

   */

}
