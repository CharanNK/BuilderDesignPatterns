package singleton.monostate;

public class Demo {

	public static void main(String[] args) {
		ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
		ceo.setName("Adam");
		ceo.setAge(28);
		
		ChiefExecutiveOfficer ceo2 = new ChiefExecutiveOfficer();
		System.out.println(ceo2);	//this tells us that there will be only one instance of CEO class 
	}
}
