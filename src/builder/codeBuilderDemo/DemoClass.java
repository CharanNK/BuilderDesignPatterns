package builder.codeBuilderDemo;

public class DemoClass {

	public static void main(String[] args) {
		CodeBuilder cb = new CodeBuilder("Program").addField("name", "String").addField("age", "int");
		System.out.println(cb);
	}

}
