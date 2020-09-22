package factory.factoryMethod;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		Point point = Point.newPolarPoint(2, 3);
		System.out.println(point);
	}
}
