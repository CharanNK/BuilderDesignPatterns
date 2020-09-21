package builder.facadeBuilder;

public class FacadeBuilderDemo {

	public static void main(String[] args) {
		PersonBuilder pb = new PersonBuilder();
		Person person = pb
				.lives()
					.at("1st street")
					.in("mysore")
					.withPostCode("500000")
				.works()
					.worksAt("ABC company")
					.as("software engineer")
					.earning(0).build();
		System.out.println(person);
	}

}
