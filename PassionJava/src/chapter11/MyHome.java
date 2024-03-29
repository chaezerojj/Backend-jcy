package chapter11;

//? 메소드 오버로딩 (overloading)
// - 메소드 이름은 같지만 매개변수의 수와 형을 다르게 하는 것

// 컴파일러가 메소드를 찾을 때 참조하는 2가지 정보
// - 메소드 이름
// - 메소드 매개변수 정보

// 메소드 이름이 같을 때는 컴파일 에러 발생
// 2가지 경우에는 허용
// - 1. 매개변수의 수가 다름
// - 2. 매개변수의 타입이 다름
// cf) 반환형은 메소드 오버로딩의 조건 해당 X


public class MyHome {
	
	public int simpleMethod() {
		return 0;
	}
	
//	public double simpleMethod() {
//		return 0.0;
//	}
	// >> 반환형은 메소드 오버로딩 조건이 아님!!
	
	public void mySimpleRoom(int n) {
		System.out.println(n);
	}
	public void mySimpleRoom(double n) {
		System.out.println(n);
	}
	public void mySimpleRoom(int n1, int n2) {
		System.out.println(n1);
		System.out.println(n2);
	}
	
	
	public static void main(String[] args) {
		MyHome myHome = new MyHome();
		myHome.mySimpleRoom(3);
		myHome.mySimpleRoom(3, 4);
		myHome.mySimpleRoom(1.567);
		
		
		System.out.println(0);
		System.out.println(0.0);
		System.out.println("string");
		
		
	}

}


//FTP (File Transfer Protocol)
// 서버 - 개발 컴퓨터
// - 개발 서버 파일 전송
// - FTP 파일 전송 클라우드 서버
// 수업 예제 파일 받음

