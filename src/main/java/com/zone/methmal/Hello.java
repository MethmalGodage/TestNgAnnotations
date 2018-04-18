package com.zone.methmal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Hello {
	
  @Test(priority=0)
  public void main() {
	  System.out.println("Test annotation priority 0");
  }
  
  @Test
  public void main1() {
	  System.out.println("Test annotation no priority");
  }
  
  @Test(priority=1)
  public void main2() {
	  System.out.println("Test annotation priority 1");
  }
  
  @Test(priority=2)
  public void main3() {
	  System.out.println("Test annotation priority 2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite annotation");
  }

}
