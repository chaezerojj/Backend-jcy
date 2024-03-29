package chapter08;

// import: 문서에 포함을 의미
import chapter08.circle.Circle;

public class CircleMain {
	
	public static void main(String[] args) {
		// 동일 패키지 내의 클래스 사용 시
		Square square = new Square();
		square.getSquare(); // I am Square. : 동일 패키지 내 사용은 import 생략 사용 가능
		
		
		Circle c1 = new Circle(42);
		chapter08.circle2.Circle c2 = new chapter08.circle2.Circle(3.155);
		double d1 = c1.getArea();
		System.out.println(d1);
		double d2 = c2.getPerimeter();
		System.out.println(d2);
		// 다른 패키지 안 클래스 가져오는 방법
		// - 1. import
		// - 2. package명 붙여주기
		
		
		// 패키지 내 동일 이름의 클래스 파일들을 둘 수 없음
		// 원의 넓이를 구하는 클래스를 배포하려고 함 == 라이브러리
		// www.wxfx.com의 Circle.java,
		// www.fxmx.com의 Circle.java라는 두개의 배포 파일이 있다면
		// > 패키지를 따로 두게 된다면 해당 클래스들은 구별 가능
		
		// 패키지의 기본
		// - 패키지 선언에 따른 문제 해결 가능
		// - 서로 다른 패키지의 두 클래스는 인스턴스 생성 시 사용하는 이름 다름
		
		// (배포)패키지 이름 규칙
		// - 모두 소문자로 구성
		// - 인터넷 도메인 이름의 역순으로 구성
		// - 이름 끝에 클래스를 정의한 주체 또는 팀 이름 추가
		// ex) www.wxfx.com >> com.wxfx.smart
		//	   www.fxmx.com >> com.fxmx.simple
		
	}

}
