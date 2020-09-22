package builder.codeBuilderDemo;

public class CodeBuilder  {
	public static String className;
	private Class classElement = new Class();
	
	public CodeBuilder() {
		
	}
	
	public CodeBuilder(String className) {
		this.className = className;
		classElement.className = className;
	}
	
	public CodeBuilder addField(String variableName, String variableType) {
		Class e = new Class(variableType,variableName);
		classElement.variables.add(e);
		return this;
	}
	
	@Override
	public String toString() {
		return classElement.toString();
	}
	
}
