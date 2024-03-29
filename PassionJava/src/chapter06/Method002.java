package chapter06;

public class Method002 {

	public static void main(String[] args) {
		// 함수 호출 시에는 매개변수의 타입과 수를 맞춰야 함
		hiEveryone(15, 175.5); // 매개변수 2개
		hiEveryone(10, 140.8);
		byEveryone();
		double myHeight = 130.5;
		hiEveryone(10, myHeight);
	}
	
	//? 매개변수(입력)가 없는 메소드의 정의
	// - void : 반환(출력)이 없음
	
	public static void hiEveryone(int age, double height) {
		// 함수 선언 시 () 안에서 매개변수가 초기화되어 선언됨
		// 매개변수는 함수가 호출될 때 선언됨
		System.out.println("안녕하세요.");
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("제 키는 " + height + "cm 입니다.");
		
	}
	
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}

}
