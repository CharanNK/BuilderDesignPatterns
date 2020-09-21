package builder.fluentBuilderInheritance;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
	public EmployeeBuilder worksAs(String position) {
		person.position = position;
		return self();
	}
	
	@Override
	public EmployeeBuilder self() {
		return this;
	}
}
