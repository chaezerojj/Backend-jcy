package chapter03;

public class Constants {
	
	public static void main(String[] args) {
		//? 상수 (Constants)
		// - 변수에 값을 딱 한 번만 할당 가능
		// - 한 번 할당된 값은 변경 불가능
		// - 키워드 final 선언이 붙어있는 변수
		// - 상수 이름은 모두 대문자로 하는 것이 관례
		// - 띄어쓰기는 _(언더바)로 함
		
		int number = 100;
		number = 10;
		final int MAX_SIZE = 100;
//		MAX_SIZE = 10; // error - final 두번 선언 불가
		final String STR = "문자열";
//		STR = "문자열 변경"; - error
		final int CONST_ASSIGNED;
		CONST_ASSIGNED = 12;
//		CONST_ASSIGNED = 11; // error
		//? 상수의 장점
		// - 상수는 애플리케이션을 작성할 때 변하면 안되는 데이터는 상수로 설정하면 실수 줄일 수 있음
		// - 상수는 변수보다 메모리 효율이 좋음
		
		// 원을 다루는 코드
		final double PI_ORIGIN = 3.14;
		
		//? 리터럴(Literals)에 대한 이해
		// - 자료형을 기반으로 표현되는 상수를 의미
		int num1 = 5 + 7; // 리터럴이 2개
		// 리터럴은 다른 데이터로 변경 불가
		// 자바는 정수는 무조건 int형으로 인식하기로 약속
		
		double num2 = 3.3 + 4.5; // 리터럴 3.3 & 4.5로 2개
		String str = "I love Java";
//		System.out.println(20000000000); // error: 표현 허용범위 초과
		// >> 자바에서는 리터럴 정수는 int형
		System.out.println(20000000000L); // long형 상수로 표현
		//? long형 상수(리터럴)
		// - l 또는 L을 붙여서 long형 리터럴로 표현
		
		// 정수형 상수의 언더바 삽입
//		int money = 1,000,000; // - error
		int money = 1_000_000; // - 언더바는 사용 가능
		System.out.println(money); // 출력값: 1000000 >> 언더바는 숫자에 영향 X
		
		//? 실수형 리터럴
		// - double형임을 명시하기 위해 d 또는 D 삽입
		System.out.println(3.0004999D);
		// - float형으로 표현 >> f 또는 F 삽입
		System.out.println(2.0004999f); // 출력값: 2.0005
		
		// 실수형 리터럴은 e표기법도 가능
		System.out.println(3.4e3); // 3.4의 10의 3승
		//? boolean 리터럴
		System.out.println(true);
		System.out.println(false);
		
		//? 문자형 리터럴 char - '' (한글자만 입력 가능)
		System.out.println('일');
		//? 문자형 리터럴 String - "" (여러 글자 입력 가능)
		System.out.println("하나 둘 셋 넷");
		
		//? 이스케이스 시퀀스 (escape sequences)
		// - 화면 상의 어떠한 상황 또는 상태를 표현하기 위해 약속된 문자
		// - 슬래시, 백슬래시
		// - \n: 개 행 문자
		System.out.println("Hello World! I love java");
		System.out.println("Hello World!");
		System.out.println("I love java");
		System.out.println("Hello World!\nI love java"); // \로 개행
		System.out.print("마지막에 개 행 문자가 없을 뿐");
		System.out.println(" print는 아래 출력물 다음 개행 이루어지지 않음");
		
		//? 인용문을 쓸 때
		// "" : 문자열의 리터럴 시작과 끝
		// “새로운 일에 도전하는 것을 두려워하지 말고, 실패에 상관없이 계속 도전해야 한다.”
		System.out.println("제임스 고슬링 왈 \"어쩌구\"");
		System.out.println("제임스 고슬링 왈 \'어쩌구\'");
		// \t - 탭 문자 
		System.out.println("1 + 1 \t = 2");
		System.out.println("11 + 11 \t = 22");
		// \ 백슬러시를 단순 문자로 사용하고 싶을 때
		System.out.println("백슬러시(\\)는 키보드 엔터 위에 있습니다.");
	}
}
