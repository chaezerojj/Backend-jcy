package chapter12;

public class SmartTv extends Tv{
	// 자막 기능 추가
	boolean caption;
	
	public void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
