package com.dbTestlayer;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void pallavi() {
	  System.out.println("hi success");
  }
  @BeforeMethod
  public void A() {
	  System.out.println("hi 1 success");
  }

  @AfterMethod
  public void B() {
	  System.out.println("hi 2 success");
  }

}
