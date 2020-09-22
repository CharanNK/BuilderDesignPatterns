package prototype.serializationCopy;

import org.apache.commons.lang3.SerializationUtils;

public class CopyThroughSerializableDemo {
	
	public static void main(String[] args) {
		Foo foo = new Foo("abc",123);
		
		Foo foo1 = SerializationUtils.roundtrip(foo);
		foo1.fooName = "Charan";
		
		System.out.println(foo);
		System.out.println(foo1);
	}
}
