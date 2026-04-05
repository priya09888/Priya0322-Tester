package com.TestNg;

import org.testng.annotations.DataProvider;

public class DataForTesting {
      @DataProvider(name="ebay Priyankas wishlist")
      public String[] search() {
    	  String[] arr = {"mobile", "sunglasses", "shoes", "mac 3 air", "AC", "Projector" };
    	  return arr;
      }
      
      @DataProvider(name="ebay Athiras wishlist")
      public String[][] data(){
    	  
    	  String[][] arr = new String[3][2];
    	  
    	  arr[0][0] = "lipstick";
    	  arr[0][1] = "Lipstick for sale | eBay";
    	  
    	  arr[1][0] = "perfume";
    	  arr[1][1] = "Perfume for sale | eBay";
    	  
    	  arr[2][0] = "eyeliner";
    	  arr[2][1] = "Eyeliner for sale | eBay";
    	  
    	  return arr;
      }
	
}
