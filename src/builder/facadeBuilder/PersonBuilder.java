package builder.facadeBuilder;

public class PersonBuilder {
	protected Person person = new Person();
	
	public PersonAddressBuilder lives() {
		return new PersonAddressBuilder(person);
	}
	
	public PersonCompanyBuilder works() {
		return new PersonCompanyBuilder(person);
	}
	
	public Person build() {
		return person;
	}
}
