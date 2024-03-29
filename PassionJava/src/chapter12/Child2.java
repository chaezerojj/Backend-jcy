package chapter12;

public class Child2 extends Parent2{
	private int x = 20; // 상위 클래스의 변수이름과 같은 이름으로 지정한 경우
	
	public void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
	
	public void printY() {
		System.out.println("y=" + y);
		System.out.println("this.y=" + this.y);
		System.out.println("super.y=" + super.y);
	}
	
	public static void main(String[] args) {
		Child2 child2 = new Child2();
		child2.method(); // x=20 >> 자기 자신이 가지고 있는 값
		child2.printY();
	}
}
