package singleton.serializationProblem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProblemDemo {
	
	
	/**	Serialization method
	 * @param basicSingleton
	 * @param fileName
	 * @throws Exception
	 */
	static void saveToFile(BasicSingleton basicSingleton,
			String fileName) throws Exception{
		try(FileOutputStream fileOut = new FileOutputStream(fileName);
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				){
			out.writeObject(basicSingleton);
		}
	}
	
	/** Deserialization method
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	static BasicSingleton readFromFile(String fileName) throws Exception{
		try(FileInputStream fileIn = new FileInputStream(fileName);
				ObjectInputStream in = new ObjectInputStream(fileIn)){
			return (BasicSingleton) in.readObject();
		}
	}

	public static void main(String[] args) throws Exception {
		BasicSingleton singleton = BasicSingleton.getInstance();
		singleton.setValue(111);
		
		String fileName = "singleton.bin";
		saveToFile(singleton, fileName);
		
		singleton.setValue(222);
		
		BasicSingleton singleton2 = readFromFile(fileName);
		
		System.out.println(singleton == singleton2);
		
		System.out.println(singleton.getValue());
		System.out.println(singleton2.getValue());
	}

}
