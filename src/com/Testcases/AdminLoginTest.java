package com.Testcases;

import com.librariesfiles.PrimusBankHomePage;

import Constants.Constants;

public class AdminLoginTest {

	public static void main(String[] args) throws InterruptedException
	{
      Constants.Launchapp("http://primusbank.qedgetech.com/");
      PrimusBankHomePage Phome=new PrimusBankHomePage();
      boolean res=Phome.adminlogin("Admin","Admin");
      if(res)
      {
    	  System.out.println("Admin login Test sucessfully pass");
      }else
      {
    	  System.out.println("Adminlogin test is fail");

	  }
         Constants.closeapp();
    }
}
