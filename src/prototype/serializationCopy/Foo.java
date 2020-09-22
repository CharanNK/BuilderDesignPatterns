package prototype.serializationCopy;

import java.io.Serializable;

public class Foo implements Serializable {
	public String fooName;
	public int fooNumber;
	
	public Foo(String fooName, int fooNumber) {
		super();
		this.fooName = fooName;
		this.fooNumber = fooNumber;
	}

	@Override
	public String toString() {
		return "Foo [fooName=" + fooName + ", fooNumber=" + fooNumber + "]";
	}
	
}
