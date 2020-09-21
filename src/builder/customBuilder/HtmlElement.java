package builder.customBuilder;

import java.util.ArrayList;
import java.util.Collections;

public class HtmlElement {
	public String tagName,text;
	public ArrayList<HtmlElement> elements = new ArrayList<>();
	private final int indentSize = 2;
	private final String newLine = System.lineSeparator();
	
	public HtmlElement() {
		
	}
	
	public HtmlElement(String name,String text) {
		this.tagName = name;
		this.text = text;
	}
	
	public String toStringImpl(int indent) {
		StringBuilder sb = new StringBuilder();
	    String i = String.join("", Collections.nCopies(indent * indentSize, " "));
	    sb.append(String.format("%s<%s>%s", i, tagName, newLine));
	    if (text != null && !text.isEmpty())
	    {
	      sb.append(String.join("", Collections.nCopies(indentSize*(indent+1), " ")))
	        .append(text)
	        .append(newLine);
	    }

	    for (HtmlElement e : elements)
	      sb.append(e.toStringImpl(indent + 1));

	    sb.append(String.format("%s</%s>%s", i, tagName, newLine));
	    return sb.toString();
	}

	@Override
	public String toString() {
		return toStringImpl(indentSize);
	}
	
}
