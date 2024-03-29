package chapter02;

public class UseVariable5 {

	public static void main(String[] args) {
		//  변수
		int number = 1;
		System.out.println(number);
		number = number + 1;
		System.out.println(number);
		int num;
		num = 3;
		System.out.println(num);
		
		int a = 1, b = 2; // 세미콜론: 문자의 끝을 의미
		System.
		out.
		println(a + b); // X 컴파일 에러는 나지 않지만 사용하지 않는 방식
		int c = 4; int d = 5; // X 틀리지 않았지만 한줄에 하나씩 선언하는 방식 사용해야 함 
		
		//? 변수 활용의 예
		int num1;
		num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println(num3);
		
		//? 다양한 자료형 활용의 예
		// - 자바 기본 실수 자료형: double
		double pi = 3.14;
		System.out.println(3.14);
		double d1, d2;
		double result;
		d1 = 1.0000001;
		d2 = 2.0000001;
		result = d1 + d2;
		System.out.println(result); // 예상값: 3.0000002 , 실제 출력값: 3.0000001999999997
		// >> 실수의 연산은 오차 발생함
		// 한정된 공간이기 때문에 공식을 사용해 소수점자리를 제한하여 실수를 저장하기 위해서
		
		//! 자주 사용하는 자료형 boolean, int, double, String
		
		System.out.println();
		
		//? boolean
		// 값: 참(true)과 거짓(false)
		// - 1byte의 공간
		// - 두가지 상황을 체크하기 위해 자주 사용
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		//? 문자열 자료형 String
		String str1 = "문자열 자료형의 표현은 쌍따옴표";
		System.out.println(str1);
		// 유니코드 (2byte), 아스키코드(1byte)
		char ch3 = 54736;
		System.out.println(ch3);
		
		String lectureName = "'정보처리기능사 취득 과정'";
		System.out.println(lectureName);
		
		
		
		
		
		
	}

}
