package builder.fluentBuilderInheritance;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {
	Person person = new Person();
	
	//critical to return self here
	public SELF withName(String name) {
		person.name = name;
		return self();
	}
	
	public SELF self() {
		//unchecked cast but actually safe
		return (SELF) this;
	}
	
	public Person build() {
		return person;
	}
}
