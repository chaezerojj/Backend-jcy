package chapter12.example3;

public class PhoneMain {

	public static void main(String[] args) {
		IPhone i = new IPhone();
		Galaxy g = new Galaxy();
		
		i.powerOn();
		i.powerOff();
		System.out.println();
		g.powerOn();
		g.powerOff();
	}

}
