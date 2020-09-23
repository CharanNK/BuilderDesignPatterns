package singleton.basicSingleton;

public class BasicDemo {

	public static void main(String[] args) {
		BasicSingleton basicSingleton = BasicSingleton.getInstance();
		
		basicSingleton.setValue(100);
		System.out.println(basicSingleton.getValue());
	}

}
