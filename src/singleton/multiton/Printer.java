package singleton.multiton;

import java.util.HashMap;

public class Printer {
	
	private static int instanceCount = 0;
	
	private Printer() {
		instanceCount++;
		System.out.println("A total of "+instanceCount+" created so far.");
	}
	
	private static HashMap<Subsystem, Printer> instances = new HashMap<>();
	
	public static Printer get(Subsystem ss){
		if(instances.containsKey(ss))
			return instances.get(ss);
		
		Printer printer = new Printer();
		instances.put(ss, printer);
		return printer;
	}
}
