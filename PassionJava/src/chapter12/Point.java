package chapter12;

// 오버라이딩(overriding)
// : 상위클래스로부터 상속받은 메소드 내용을 변경하는 것
// - override: ~위엥 덮어쓰다(overwrite)

public class Point {
	protected int x; // 접근수준 지시자를 protected로 변경 
	// protected : 상속관계에 있을 때 직접 접근 가능
	private int y; // 해당 클래스 안에서만 가능, 상속관계 클래스에서는 사용 불가
	
	public String what() {
		return "I am a Point.";
	}
	
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getLocation() {
		return "x: " + x + ", y: " + y ;
	}
	
	public void parentMethod() {
		
	}
}
