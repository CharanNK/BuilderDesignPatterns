package factory.abstractFactory;

public class AbstractFactoryDemo {
	AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
	
	Shape shape1 = shapeFactory.getShape("RECTANGLE");
	//shape1.draw();  call draw method of rectangle
	
	Shape shape2 = shapeFactory.getShape("SQUARE");
	//	shape2.draw(); call draw method of square
	
	AbstractFactory roundedAbsFactory = FactoryProducer.getFactory(true);
	
	Shape shape3 = shapeFactory.getShape("RECTANGLE");
	//shape1.draw();  call draw method of Rounded rectangle
	
	Shape shape4 = shapeFactory.getShape("SQUARE");
	//	shape2.draw(); call draw method of Rounded square 
	
	
}
