package prototype.CopyConstructor;

public class Address {
	String streetName, city, country;

	public Address(String streetName, String city, String country) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.country = country;
	}
	
	public Address(Address newAddress) {
		this(newAddress.streetName,newAddress.city,newAddress.country);
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", country=" + country + "]";
	}
	
	
}
