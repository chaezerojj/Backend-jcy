package chapter11;

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Exercise6_4 getDistance() {
		return getDistance();
	}
}

public class Exercise6_6 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		// p와 (2,2)거리를 구함
		System.out.println(p.getDistance());
	}

}