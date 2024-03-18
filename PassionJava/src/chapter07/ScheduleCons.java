package chapter07;

public class ScheduleCons {
	int month;
	int date;
	String todo;
	boolean check;

	public ScheduleCons(int month, int date, String todo, boolean check) {
		this.month = month;
		this.date = date;
		this.todo = todo;
		this.check = check;
	}
	
	@Override
	public String toString() {
		return "ScheduleCons [" + month + "월 " + date + "일 할 일 목록 : " + todo + ", 완료 : " + check + "]";
	}
	public static void main(String[] args) {
		ScheduleCons s1 = new ScheduleCons(3, 18, "자바 복습하기", true);
		System.out.println(s1.toString());
	}

}