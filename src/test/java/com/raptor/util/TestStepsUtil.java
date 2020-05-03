package com.raptor.util;

import net.minidev.json.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TestStepsUtil {

    // click step
    public static void clickStep(JavascriptExecutor js, String locator, String time) throws InterruptedException {

        //this is the magic
        //js.executeScript will penetrate through all the way deep to your element of concern
        //locator is having jsPath of the element which you can get from chrome inspect and copy jspath
        js.executeScript("arguments[0].click();", (WebElement)js.executeScript("return " + locator));
        Thread.sleep(Long.parseLong(time));
    }

    //input step
    public static void inputStep(JavascriptExecutor js, String locator, String time, String inputValue)throws InterruptedException
    {
        js.executeScript("arguments[0].value="+ inputValue + ";", (WebElement)js.executeScript("return " + locator));
        Thread.sleep(Long.parseLong(time));

    }

    //wait step
    public static void waitStep(String timer) throws InterruptedException {
        Thread.sleep(Long.parseLong(timer));
    }

    //navigate step
    public static void navigateStep(JavascriptExecutor js, String url, String time) throws InterruptedException {
        js.executeScript("window.location = " + url);
        Thread.sleep(Long.parseLong(time));
    }

    //execute test based on action
    public static void executeTestBasedOnAction(JavascriptExecutor js, JSONObject scriptObject) {
        System.out.println(scriptObject);
        try{
            switch(scriptObject.getAsString("action")) {
                case "navigate":
                    TestStepsUtil.navigateStep(js,scriptObject.getAsString("url"), scriptObject.getAsString("time") );
                    break;
                case "click":
                    TestStepsUtil.clickStep(js, scriptObject.getAsString("locator"), scriptObject.getAsString("time"));
                    break;
                case "wait":
                    TestStepsUtil.waitStep(scriptObject.getAsString("time"));
                    break;
                case "input":
                    TestStepsUtil.inputStep(js, scriptObject.getAsString("locator"), scriptObject.getAsString("time"), scriptObject.getAsString("inputValue"));
                    break;
                default:
                    // code block
            }

            //js.executeScript("arguments[0].click();", (WebElement)js.executeScript("return " + scriptObject.getAsString("locator")));
        }catch(InterruptedException ex){
            //do stuff
        }
    }
}
