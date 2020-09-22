package prototype.CopyConstructor;

public class Employee {
	public String name;
	public Address address;
	
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public Employee(Employee otherEmployee) {
		this.name = otherEmployee.name;
		address = new Address(otherEmployee.address);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
	
}
