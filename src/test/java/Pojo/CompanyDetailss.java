package Pojo;

import java.util.List;

public class CompanyDetailss {

	private String Companyname;
	private String CompanyHOcity;
	private String CompanyCEO;
	private List<String> supportedsalarybanks;
	private List<Integer> PinCodeOfCityOffices;
	List<Employ> employees;
	List<Contract> contractors;
	PFdetails compnypfdetails;

	public String getCompanyname() {
		return Companyname;
	}

	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}

	public String getCompanyHOcity() {
		return CompanyHOcity;
	}

	public void setCompanyHOcity(String companyHOcity) {
		CompanyHOcity = companyHOcity;
	}

	public String getCompanyCEO() {
		return CompanyCEO;
	}

	public void setCompanyCEO(String companyCEO) {
		CompanyCEO = companyCEO;
	}

	public List<String> getSupportedsalarybanks() {
		return supportedsalarybanks;
	}

	public void setSupportedsalarybanks(List<String> supportedsalarybanks) {
		this.supportedsalarybanks = supportedsalarybanks;
	}

	public List<Integer> getPinCodeOfCityOffices() {
		return PinCodeOfCityOffices;
	}

	public void setPinCodeOfCityOffices(List<Integer> pinCodeOfCityOffices) {
		PinCodeOfCityOffices = pinCodeOfCityOffices;
	}

	public List<Employ> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employ> employees) {
		this.employees = employees;
	}

	public List<Contract> getContractors() {
		return contractors;
	}

	public void setContractors(List<Contract> contractors) {
		this.contractors = contractors;
	}

	public PFdetails getCompnypfdetails() {
		return compnypfdetails;
	}

	public void setCompnypfdetails(PFdetails compnypfdetails) {
		this.compnypfdetails = compnypfdetails;
	}

}
