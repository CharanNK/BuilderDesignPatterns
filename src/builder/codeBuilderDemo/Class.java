package builder.codeBuilderDemo;

import java.util.ArrayList;
import java.util.Collections;

import builder.customBuilder.HtmlElement;

public class Class {
	public String className;
	public String variableType,variableName;
	public ArrayList<Class> variables = new ArrayList<>();
	private final int indentSize = 2;
	private final String newLine = System.lineSeparator();
	
	public Class() {
		
	}
	
	public Class(String variableType,String variableName) {
		this.variableType = variableType;
		this.variableName = variableName;
	}
	
	public String toStringImpl(int indent) {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("class %s%s",className,newLine));
		sb.append(String.format("{%s",newLine));
	    String i = String.join("", Collections.nCopies(indent * indentSize, " "));

	    for (Class e : variables)
	      sb.append(String.format("%s public %s %s;%s", i, e.variableType,e.variableName, newLine));

	    sb.append("}");
	    return sb.toString();
	}

	@Override
	public String toString() {
		return toStringImpl(indentSize);
	}
	
	
}
