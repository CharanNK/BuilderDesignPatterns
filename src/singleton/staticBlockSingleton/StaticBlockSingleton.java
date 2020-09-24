package singleton.staticBlockSingleton;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {
	
	public StaticBlockSingleton() throws IOException {
		System.out.println("Singleton is initializing");
		File.createTempFile(".", ".");  // this throws an IOException as we cannot have a file with two .
	}
	
	//We are not making the instance variable as final here
	private static StaticBlockSingleton instance;
	
	//instead we are creating a static block and initializing the instance inside that
	static {
		try {
			instance = new StaticBlockSingleton();
		}catch(Exception ex) {
			System.out.println("Failed to create a singleton");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}

}
