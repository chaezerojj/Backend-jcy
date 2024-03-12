package chapter02; // package 이름

public class UseVariable {

	public static void main(String[] args) { // main method: main 입력 후 ctrl + space 단축키
		// ** 변수의 이해와 활용
		// ? 변수
		// : 변하는 수
		// - 메모리 공간의 활용을 위한 도구
		// - 메모리 공간의 할당과 접근을 위해 필요한 도구

		// 변수 num1의 선언 - 정수 데이터
		// - 변수 선언 시 (데이터 타입) + (변수 이름)
		int num1; // int: 데이터 타입, num1이라는 변수 이름 선언
		// 변수에 값(data)를 할당(저장, 대입)
		num1 = 10;
		System.out.println(num1);
		System.out.println(10);

		// 변수 선언과 대입을 동시에 함 = 변수의 초기화
		int num2 = 20;
		// 데이터가 그냥 표현된 것을 리터럴
		// 리터럴로 코드 작성
		System.out.println("10 + 20 = " + (10 + 20));
		// 변수를 사용하여 코드 작성
		int num3 = 10;
		int num4 = 20;
		System.out.println("10 + 20 = " + (num3 + num4));
		System.out.println(num3 + " + " + num4 + " = " + (num3 + num4));
		// 유지보수를 위해 변수를 사용
		// >> 변수를 많이 사용하자
		
		// ? 자료형의 종류와 구분
		// 1. boolean (참-거짓, 1byte) - 자주 사용
		// 2. char (문자형, 2byte)
		// 3. byte (정수형, 1byte)
		// 4. short (정수형, 2byte)
		// 5. int (정수형, 4byte) - 자주 사용
		// 6. long(정수형, 8byte)
		// 7. float (실수형, 4byte)
		// 8. double(실수형, 8byte) - 자주 사용
		// 9. String
		
		boolean b;
		int integer;
		double d;
		// ? 변수의 이름
		// - 1. 자바는 대소분자를 구분
		int num5;
		int NUM5;
		// 2. 변수의 이름은 숫자로 시작할 수 없다.
		// int 1num; (X)
		// 2. $와 _ 이외의 특수문자는 변수의 이름에 사용할 수 없다.
		// - $와 _는 써서 변수 이름을 정하지 않는다.
		int n$;
		int n_; // 사용은 O, but 보편적으로 사용되진 않음
		// 4. 키워드는 (자주색, 예약어) 변수의 이름으로 사용할 수 없다.
		// int int; int boolean; <- 사용 X
	
		
		int number;
		
	}

}
