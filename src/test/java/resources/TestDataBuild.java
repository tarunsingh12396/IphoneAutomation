package resources;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

import Pojo.AddNewPlaceData;
import Pojo.LocationChild;

public class TestDataBuild {
	
	public AddNewPlaceData requestSpecification() {
		
		Faker f = new Faker();
		
		

		AddNewPlaceData d = new AddNewPlaceData();
		LocationChild c = new LocationChild();

		c.setLat(-38.383494);
		c.setLng(33.427362);

		d.setLocation(c);

		d.setAccuracy(50);
		d.setLanguage("French");
		d.setName(f.name().firstName());
		d.setPhone_number(f.phoneNumber().cellPhone());

		List<String> type = new ArrayList<String>();
		type.add("shoe park");
		type.add("shop");

		d.setTypes(type);
		d.setWebsite("http://google.com");
			
		return d;     // d kya h addnewplace data h toh return kya hoga addnewplacedata toh void ki jgha addnewplace data likh diya 

		
		
		
		
		
		
		
		
	}

}
