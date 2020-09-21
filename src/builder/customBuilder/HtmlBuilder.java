package builder.customBuilder;

public class HtmlBuilder {
	public String rootName;
	private HtmlElement root = new HtmlElement();
	
	public HtmlBuilder() {
	}
	
	public HtmlBuilder(String rootName) {
		this.rootName = rootName;
		root.tagName = rootName;
	}
	
	
	public void addChild(String childName,String childText) {
		HtmlElement e = new HtmlElement(childName,childText);
		root.elements.add(e);
	}
	
	public HtmlBuilder addChildFluent(String childName, String childText) {
		HtmlElement e = new HtmlElement(childName,childText);
		root.elements.add(e);
		return this;
	}
	
	public void clear() {
		root = new HtmlElement();
		root.tagName = rootName;
	}

	@Override
	public String toString() {
		return root.toString();
	}
	
	
}
