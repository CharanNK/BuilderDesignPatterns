package singleton.enumBasedSingleton;

enum EnumBasedSingleton {
	INSTANCE;
	
	int value; //this field does not get serialized

	//enum already has a private constructor - but if you want to initialize values
	EnumBasedSingleton() {
		value = 50;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
