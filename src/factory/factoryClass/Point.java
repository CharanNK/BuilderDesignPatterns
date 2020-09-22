package factory.factoryClass;

public class Point {
	private double x,y;
	
	private Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/*
	 * this class is made static to provide access to methods inside the class
	 * This class is made nested to access the constructor of Point class which is private
	 */
	public static class Factory{
		public static Point newCartesianPoint(double x,double y) {
			return new Point(x, y);
		}
		
		public static Point newPolarPoint(double rho,double theta) {
			return new Point(rho*Math.cos(theta),rho*Math.sin(theta));
		}
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
