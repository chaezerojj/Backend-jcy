package chapter03;

public class Conversion {

	public static void main(String[] args) {
		int integer = 42;
		integer = 45;
//		integer = "42"; // error: 자바에서는 자료형에 맞는 자료만 대입 가능
//		int n1 = "string"; // error: 위와 동일한 이유
		
//		int n2 = 3.14; // error: 실수형에 맞는 자료형을 넣어야 함 (정수만 가능)
		double d1 = 3.14;
		String s1 ="s";
//		String s2 = 's'; // error: '' = char만 사용 가능, String: ""
		
		//? 명시적 형 변환
		double pi = 3.14159;
		int wholeNumber = (int)pi; // 강제 형변환
		System.out.println(wholeNumber);
		
		// 더 작은 크기로 형 변환 시 원본 데이터가 훼손됨을 주의해야 함
		long num1 = 3000000000000007l;
		int num2 = (int)num1;
		System.out.println(num2); // -296517625
		
		long num3 = 42;
		int num4 = (int)num3;
		System.out.println(num4);
		
		// 기본 자료형 이외의 자료형은 메소드를 사용하여 형 변환
		String s2 = "42";
		int n2 = Integer.valueOf(s2);
		System.out.println(n2);
		
		//? 자동 형변환
		// 1. 자료형의 크기가 큰 방향으로 형 변환 발생
		// 2. 자료형 크기와 상관없이 정수 자료형보다 실수자료형이 우선
		int number1 = 50;
		long number2 = 313783647L;
		System.out.println(number1 + number2); // 출력값: 313783697
		// 자료형이 일치해야 연산이 진행되므로
		// number1에 저장된 값이 long형으로 자동 형 변환되어 연산됨
		double dd1 = 30;
		System.out.println(dd1); // 출력값: 30.0
		System.out.println(59L + 34.5f); // 출력값: 93.5 >> float형으로 자동 변환되어 출력됨
	}

}
