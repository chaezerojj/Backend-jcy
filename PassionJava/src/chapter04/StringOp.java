package chapter04;

public class StringOp {

	public static void main(String[] args) {
		//? 문자열 연산자 + 
		// >> 문자열 결합연산자(+)
		// - 피연산자 중 한쪽이 문자열이면 +연산자는 문자열 결합 연산자
		System.out.println("문자열 " + 42);
		System.out.println(42 + " 문자열");
		System.out.println(10 + 10 + " 문자열");
		System.out.println(10 + "문자열" + 10);
		// *, /, %, >, + , -
		String str1 = 10 + "문자열";
		System.out.println(str1);
		
		int n1 = 10;
		String str3 = "문자열";
		String str4 = n1 + str3; // String타입으로 반환
		System.out.println(str4); // 출력값: 10문자열
		
		
		
		
		
		
		
		
		
		
	}

}
