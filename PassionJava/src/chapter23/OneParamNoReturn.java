package chapter23;

// 매개변수가 있고 반환하지 않는 람다식

public class OneParamNoReturn {
	public static void main(String[] args) {
		Printable p;
		
		// 람다식 줄임없는 표현
		p = (String s) -> {
			System.out.println(s);
		};
		p.print("람다식 줄임없는 문장");
		
		// 람다식 중괄호 생략한 표현
		// - 메소드 몸체가 하나의 문장이면 중괄호 생략 가능
		p = (String s) -> System.out.println(s);
		p.print("람다식 중괄호 생략한 문장");
		
		// 람다식 매개변수 형 생략한 표현
		p = (s) -> System.out.println(s);
		p.print("람다식 매개변수 형 생략한 문장");
		
		// 람다식 매개변수 소괄호 생략한 표현
		// - 매개변수가 1개인 경우만 생략 가능
		p = s -> System.out.println(s);
		p.print("람다식 매개변수 소괄호 생략한 문장");
		
		
		
	}
}







