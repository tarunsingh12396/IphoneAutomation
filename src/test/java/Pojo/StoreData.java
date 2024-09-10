package Pojo;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class StoreData {

	@Test
	public void createData() {

		CompanyDetails d = new CompanyDetails();
		d.setCompanyname("LevelUp360");
		d.setCompanyHOcity("Bengaluru");
		d.setCompanyCEO("Anshul");
		List<String> supportedSalaryBanks = new ArrayList<String>();
		supportedSalaryBanks.add("HDFC");
		supportedSalaryBanks.add("ICICI");
		supportedSalaryBanks.add("AXIS");
		d.setSupportedSalaryBanks(supportedSalaryBanks);

		List<Integer> PINCODEofcityOffices = new ArrayList<Integer>();
		PINCODEofcityOffices.add(560037);
		PINCODEofcityOffices.add(360034);
		PINCODEofcityOffices.add(456343);
		d.setPINCODEofcityOffices(PINCODEofcityOffices);

		JSONArrayPojo j = new JSONArrayPojo();
		j.setFirstname("Anshul");
		j.setLastname("Chauhan");
		j.setGender("Male");
		j.setAge(28);
		j.setSalary(10000.56);
		j.setMarried(false);

		JSONArrayPojo s = new JSONArrayPojo();
		s.setFirstname("Mark");
		s.setLastname("Wood");
		s.setGender("Male");
		s.setAge(30);
		s.setSalary(20000.56);
		s.setMarried(false);

		List<JSONArrayPojo> Employees = new ArrayList<JSONArrayPojo>();
		Employees.add(j);
		Employees.add(s);
		d.setEmployees(Employees);

		Contractors r = new Contractors();
		r.setContractfrom("jan-2020");
		r.setFirstname("seema");
		r.setLastname("saher");
		r.setContractto("jan-2025");
		List<Contractors> contractors = new ArrayList<Contractors>();
		contractors.add(r);
		d.setContractors(contractors);

		CompanyPFdetails c = new CompanyPFdetails();
		c.setPfname("xyz");
		c.setPfcity("Bengaluru");
		c.setPfyear("2015");
		c.setNoOfEmployees("10");
		d.setCompanyPFdetails(c);

		RestAssured.baseURI = "https://rahulshettyacademy.com";

	String	response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(d).when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
				.extract().response().asString();
	JsonPath js = new JsonPath(response);
    String firstname = js.getString("name");
    System.out.println(firstname);
   
		
		

	}

}
