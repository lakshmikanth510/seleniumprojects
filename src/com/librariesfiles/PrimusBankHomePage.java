package com.librariesfiles;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;

import Constants.Constants;

public class PrimusBankHomePage extends Constants
{
	public boolean adminlogin(String uid,String pwd) throws InterruptedException 
	{
      String expurl,acturl;
      expurl="adminflow";
      driver.findElement(By.id("txtuId")).sendKeys(uid);
      driver.findElement(By.id("txtPword")).sendKeys(pwd);
      driver.findElement(By.id("login")).click();
      Thread.sleep(2000);
      acturl=driver.getCurrentUrl();
      if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
      {
		return true;
	  }else
	  {
		  return false;
	  }
      
	}

}
