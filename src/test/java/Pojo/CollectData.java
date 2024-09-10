package Pojo;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class CollectData {
    @Test
	public void collection() {

		CompanyDetailss d = new CompanyDetailss();
		d.setCompanyname("LevelUp360");
		d.setCompanyHOcity("Bengaluru");
		d.setCompanyCEO("Anshul");
		List<String> supportedSalaryBanks = new ArrayList<String>();
		supportedSalaryBanks.add("HDFC");
		supportedSalaryBanks.add("ICICI");
		supportedSalaryBanks.add("AXIS");
		d.setSupportedsalarybanks(supportedSalaryBanks);

		List<Integer> PINCODEofcityOffices = new ArrayList<Integer>();
		PINCODEofcityOffices.add(560037);
		PINCODEofcityOffices.add(360034);
		PINCODEofcityOffices.add(456343);
		d.setPinCodeOfCityOffices(PINCODEofcityOffices);

		Employ e = new Employ();
		e.setFirstname("Anshul");
		e.setLastname("chauhan");
		e.setGender("Male");
		e.setAge(28);
		e.setSalary(200000.56);
		e.setMarried(false);

		Employ m = new Employ();
		m.setFirstname("Mark");
		m.setLastname("Wood");
		m.setGender("Male");
		m.setAge(30);
		m.setSalary(1000000.56);
		m.setMarried(false);

		List<Employ> employees = new ArrayList<Employ>();
		employees.add(e);
		employees.add(m);
		d.setEmployees(employees);

		Contract c = new Contract();

		c.setFirstname("Seema");
		c.setLastname("Saher");
		c.setContractfrom("Jan-2020");
		c.setContractto("Jan-2025");

		Contract o = new Contract();
		o.setFirstname("Seema");
		o.setLastname("Saher");
		o.setContractfrom("Jan-2020");
		o.setContractto("Jan-2025");

		List<Contract> contractors = new ArrayList<Contract>();

		contractors.add(c);
		contractors.add(o);
		d.setContractors(contractors);

		PFdetails pfdetails = new PFdetails();
		pfdetails.setPfname("xyz");
		pfdetails.setPfcity("Bengaluru");
		pfdetails.setPfyear("2015");
		pfdetails.setNoofemployees("10");

		d.setCompnypfdetails(pfdetails);

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(d).when()
				.post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).extract().response()
				.asString();

	}

}
