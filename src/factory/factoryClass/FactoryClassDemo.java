package factory.factoryClass;

public class FactoryClassDemo {
	public static void main(String[] args) {
		Point point = new Point.Factory().newCartesianPoint(2, 3);
		System.out.println(point);
	}
}
