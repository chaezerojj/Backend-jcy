package chapter18;

public class NullPointException2 {
	public void sayHello() {
		System.out.println("Hello");
	}

	private NullPointException2 npe;
	
	public NullPointException2 getNpe() {
		return npe;
	}

	public void setNpe(NullPointException2 npe) {
		this.npe = npe;
	}

	public static void main(String[] args) {
		NullPointException2 npe2 = new NullPointException2();
		npe2.sayHello();
		npe2.getNpe().toString();
		// 일반 예외
	}
}
