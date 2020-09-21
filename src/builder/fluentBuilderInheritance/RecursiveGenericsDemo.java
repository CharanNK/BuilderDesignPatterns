package builder.fluentBuilderInheritance;

public class RecursiveGenericsDemo {

	public static void main(String[] args) {
		EmployeeBuilder eb = new EmployeeBuilder().withName("charan").worksAs("software engineer");
		System.out.println(eb.build());
	}

}
