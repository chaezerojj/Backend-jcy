package chapter12;

public class Child extends Parent{
	// 자동적으로 age라는 멤버변수가 추가된것 같은 효과 있음
	public void play() {
		System.out.println("play");
	}
	// 하위클래스에 새로운 코드 추가해도 상위클래스에 영향X
	
	// 상속
	// - 하위 클래스는 상위 클래스의 모든 멤버(변수와 메소드) 상속받음
	// - 하위클래스 멤버개수는 조상클래스보다 항상 같거나 많음
}
