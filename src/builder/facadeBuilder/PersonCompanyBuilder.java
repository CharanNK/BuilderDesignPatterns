package builder.facadeBuilder;

public class PersonCompanyBuilder extends PersonBuilder{
	public PersonCompanyBuilder(Person person) {
		this.person = person;
	}
	
	public PersonCompanyBuilder worksAt(String companyName) {
		person.companyName = companyName;
		return this;
	}
	
	public PersonCompanyBuilder as(String position) {
		person.position = position;
		return this;
	}
	
	public PersonCompanyBuilder earning(int annualIncome) {
		person.annualIncome = annualIncome;
		return this;
	}
}
