package chapter05;

public class ArrayLength {

	public static void main(String[] args) {
		//? 배열 길이
		// - 배열에 저장할 수 있는 전체 항목의 개수
		
		int[] intArray = {10, 20, 30};		
		System.out.println(intArray.length);
		// 배열 객체(class 문법으로 표현 가능)
		// >> length 속성(field)
		// 배열 안에 있는 일종의 변수 length는 배열 길이를 담고 있음
		// System.out.println(); >> () : 함수 호출
 		// Math.random(); 
		String[] fruits = {"사과", "바나나", "배"};
		System.out.println(fruits.length);
		// 배열변수.length
		
		System.out.println("=================");
		
		// length변수를 사용하여 과목별 총합과 평균 구하는 코드 수정해보기 
		int[] scores = {83, 90, 87, 85, 95};
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("과목 개수: " + scores.length);
		System.out.println("총합: " + sum);
		double avg = sum / scores.length;
		System.out.println("평균: " + avg);
		
		// >> length변수를 사용하여 코드 수정 시 추가 수정이 없음!!
		
		System.out.println("=================");
		
		int[] intArr = new int[10];
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
