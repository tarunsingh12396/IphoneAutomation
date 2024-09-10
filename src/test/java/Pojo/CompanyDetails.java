package Pojo;

import java.util.List;

public class CompanyDetails {

	private String companyname;
	private String companyHOcity;
	private String companyCEO;
	private List<String> supportedSalaryBanks;
	private List<Integer> PINCODEofcityOffices;
	List<JSONArrayPojo> Employees;
	 List<Contractors> contractors; 
	CompanyPFdetails  companyPFdetails;
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanyHOcity() {
		return companyHOcity;
	}
	public void setCompanyHOcity(String companyHOcity) {
		this.companyHOcity = companyHOcity;
	}
	public String getCompanyCEO() {
		return companyCEO;
	}
	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}
	public List<String> getSupportedSalaryBanks() {
		return supportedSalaryBanks;
	}
	public void setSupportedSalaryBanks(List<String> supportedSalaryBanks) {
		this.supportedSalaryBanks = supportedSalaryBanks;
	}
	public List<Integer> getPINCODEofcityOffices() {
		return PINCODEofcityOffices;
	}
	public void setPINCODEofcityOffices(List<Integer> pINCODEofcityOffices) {
		PINCODEofcityOffices = pINCODEofcityOffices;
	}
	public List<JSONArrayPojo> getEmployees() {
		return Employees;
	}
	public void setEmployees(List<JSONArrayPojo> employees) {
		Employees = employees;
	}
	public List<Contractors> getContractors() {
		return contractors;
	}
	public void setContractors(List<Contractors> contractors) {
		this.contractors = contractors;
	}
	public CompanyPFdetails getCompanyPFdetails() {
		return companyPFdetails;
	}
	public void setCompanyPFdetails(CompanyPFdetails companyPFdetails) {
		this.companyPFdetails = companyPFdetails;
	}
	
	
	

}
