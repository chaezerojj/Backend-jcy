package chapter18;

public class NumberFormatException {
	public static void main(String[] args) {
		// 명시적 형변환은 기본 데이터 타입만 적용 가능
		// 문자열을 숫자로 변환하려면 Integer.parseInt(String s)
		// (다음에 배울 내용)
		String data1 = "100";
		String data2 = "a100";
		
		// 숫자로 변환
		int num1 = Integer.parseInt(data1);
//		int num2 = Integer.parseInt(data2);
		// java.lang.NumberFormatException: For input string: "a100"
		System.out.println(num1);
	}
}
