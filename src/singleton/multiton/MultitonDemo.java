package singleton.multiton;

public class MultitonDemo {

	public static void main(String[] args) {
		Printer mainPrinter = Printer.get(Subsystem.PRIMARY);
		Printer auxPrinter = Printer.get(Subsystem.AUXILARY);
		Printer auxPrinter2 = Printer.get(Subsystem.AUXILARY);
	}

}
