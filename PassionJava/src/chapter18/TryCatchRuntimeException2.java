package chapter18;

public class TryCatchRuntimeException2 {
	
	public static void main(String[] args) {
		String data1 = null;
		try {
			System.out.println("예외 발생 전 코드");
			System.out.println(data1.toString());
			System.out.println("예외 발생 후 코드");
		} catch (NullPointerException e) {
			System.out.println("null값이 대입되어 있습니다.");
		} finally {
			// finally: 예외와 상관없이 항상 실행하는 블록
			System.out.println("finally 블록 코드");
		}
		System.out.println("종료");
	}
}
