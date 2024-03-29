package chapter04;

public class SwitchExample {

	public static void main(String[] args) {
		//? switch문
		/*
		 * switch(변수) {
		 * 		case 값1: 
		 * 				실행문A
		 * 				break;
		 * 		case 값2: 
		 * 				실행문B
		 * 				break;
		 * 		default:
		 * 				실행문C
		 * }
		 * 
		 * */
		// 변수 == 값2
		int num1 = 1;
		switch (num1) {
		case 1:
			System.out.println("num1: " + num1);
			break;
		case 2:
			System.out.println("num1: " + num1);
			break;
		default:
			System.out.println("error");
		}
		
		System.out.println();
		
		int time = 9;
		System.out.println("[ 현재 시간: " + time + "시 입니다. ]");
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의 중입니다.");
			break;
		case 10:
			System.out.println("업무 중입니다.");
			break;
		case 12:
			System.out.println("점심시간 입니다.");
			break;
		case 5:
			System.out.println("퇴근합니다.");
			break;
		default:
			System.out.println("외근 중입니다.");
			break;
		}
		//>> break(keyword, 예약어)는 switch문과 반복문의 실행을 완전히 끝냄
		
		if (true) {
			System.out.println(1);
			System.out.println(2);
//			break;
		}
		
		// String타입의 switch문
		String position = "과장";
		
		switch (position) {
		case "부장" : 
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			break;
		}

		
		
		
		
	}

}
