package builder.facadeBuilder;

public class Person {
	//address fields
	public String streetName, city, postCode;
	
	//employment fields
	public String companyName, position;
	public int annualIncome;
	@Override
	public String toString() {
		return "Person{" +
			    "streetAddress='" + streetName + '\'' +
			    ", postcode='" + postCode + '\'' +
			    ", city='" + city + '\'' +
			    ", companyName='" + companyName + '\'' +
			    ", position='" + position + '\'' +
			    ", annualIncome=" + annualIncome +
			    '}';
	}
}
