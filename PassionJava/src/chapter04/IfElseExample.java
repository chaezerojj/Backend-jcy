package chapter04;

public class IfElseExample {

	public static void main(String[] args) {
		//? If-else문
		
		/* if (조건식) {
		 * 		실행문A
		 * 
		 * } else {
		 * 		실행문B
		 * }
		 */
		
		// if문의 조건식이 true라면 if문 블록 안 실행문이 실행
		// if문의 조건식이 false라면 else문 블록안 실행문이 실행
		
		
		int score = 85;
		if (score >= 90) {
			System.out.println("점수가 90 이상입니다.");
			System.out.println("A");
		} else {
			System.out.println("점수가 90 미만입니다.");
			System.out.println("B");
		}
		
		
		
		
		
	}

}
