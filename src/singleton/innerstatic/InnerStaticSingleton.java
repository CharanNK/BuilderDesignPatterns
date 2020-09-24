package singleton.innerstatic;

public class InnerStaticSingleton {
	
	/*
	 * Inner static Singleton is made to ensure thread safety
	 */
	private InnerStaticSingleton() {};
	
	private static class Impl{
		//inner classes can access the private members and methods of the outer class
		private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
	}
	
	public InnerStaticSingleton getInstance() {
		return Impl.INSTANCE;
	}
}
