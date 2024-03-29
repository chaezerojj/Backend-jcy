package chapter07;

public class GetterSetter {
	private String name;
	private String phoneNumber;
	
	// Getter Setter
	// Getter : 값을 가져올 때 사용하는 메소드
	// Setter : 값을 대입할 때 사용하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public static void main(String[] args) {
		GetterSetter gs = new GetterSetter();
		System.out.println(gs.getName()); // null
		gs.setName("김자바");
		System.out.println(gs.getName());
		gs.setPhoneNumber("전화번호");
		System.out.println(gs.getPhoneNumber());
		
		// DTO (Data Transfer Object), VO(Value Object) 클래스
		// >> 두가지 방법으로 값을 초기화함
		// - 1. 생성자 사용
		// - 2. 게더세터(Getter Setter) 사용
		
		
	}

}
