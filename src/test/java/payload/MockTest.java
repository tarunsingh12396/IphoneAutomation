package payload;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class MockTest {
	@Test
	public void validatetest() {
		
		
		
	// number of courses	
		
		JsonPath js = new JsonPath(GooglePlacePayload.courseprice());
		 int totalCourses = js.getList("dashboard.courses").size();
	System.out.println(totalCourses);
		
	// first course title 
	
String title=	js.getString("dashboard.courses[0].title");
System.out.println(title);

   // title and  price of all courses

      for(int i = 0; i< totalCourses;i++) {
    	  
    	  String titles=  	  js.getString("dashboard.courses["+i+"].title");
    	  System.out.println(titles);
    	  
    	  int prices=  	  js.getInt("dashboard.courses["+i+"].price");
    	  
    	 System.out.println(prices);
    	  
    	  
      
      
      //copies of rpa courses
      if (titles.equals("RPA")) {
    	  int  copy=  	  js.getInt("dashboard.courses["+i+"].copies");
    	  System.out.println(copy);
    	  
    	  
      }
	
       
      
      // purchase amount and total course price
      
      int sum = 0;
      for(int j=0;j<totalCourses;j++) {
    	  
    	  int  copy=  	  js.getInt("dashboard.courses["+i+"].copies");
    	  int pricesh=  	  js.getInt("dashboard.courses["+i+"].price");
    	  
    	  int TotalPrice=copy*pricesh;
    	  sum=sum+TotalPrice;
    	  
    	  
      }	  
    	  System.out.println(sum);
    	  
    	  
      }
      }  
      


		
	}


