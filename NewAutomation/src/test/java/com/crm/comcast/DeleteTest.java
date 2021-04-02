package com.crm.comcast;

import org.testng.annotations.Test;

public class DeleteTest
{
   @Test
   public void delete()
   
   {
	   String URL = System.getProperty("url");
	   String BROWSER = System.getProperty("browser");
	   
	   System.out.println("Url is :" +URL);
	   System.out.println("Browser is :" +BROWSER);
	System.out.println("TestCase Delete Successfully");
   }
}
