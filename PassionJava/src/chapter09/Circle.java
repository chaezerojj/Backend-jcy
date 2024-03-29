package chapter09;

//? 정보 은닉
// 객체 지향 언어의 4가지 특징
// >> 추상화, 캡슐화, 상속성, 다형성
// 기능별로 코드를 모아두는 것이 가장 좋음
// == 캡슐화
// >> 응집도 높아지고 결합도 낮아짐
// >> 유지보수성과 확장성 좋아짐
// 정보 은닉 (캡슐화)
// 객체 간 서로 메시지를 주고받을 때 응집이 심하면 안됨


public class Circle {
	private double rad;
	private final double PI;
	
	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public double getPI() {
		return PI;
	}

	public Circle(double r) {
		rad = r;
		PI = 3.14;
 	}
	
	public double getArea() {
		return (rad * rad) * PI;
	}
	
	
	public static void main(String[] args) {
		
		
		
	}

}
