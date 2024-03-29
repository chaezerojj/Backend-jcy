package chapter07;

// 자바에서는 하나의 클래스 파일을 생성하여
// 클래스 안에서 코드 작성

// 클래스 = 데이터 + 기능
// 인스턴스 변수 : 클래스 내에 선언된 변수
// 인스턴스 메소드 : 클래스 내에 정의된 메소드

public class BankAccount002 {
	int balance = 0;

	// 기능
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	// 출금
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	// 예금 조회
	public int checkMyBalance() {
		System.out.println("잔액: " + balance);
		return balance;
	}

	public static void main(String[] args) {
		// 클래스 = 틀
		// 클래스 사용을 위해 인스턴스 생성
		// A라는 사람의 통장을 발급
		// >> 통장 인스턴스 생성
		// 클래스이름 변수이름 = new 클래스이름();
		BankAccount002 ba = new BankAccount002();
		
		// 2개의 인스턴스 생성
		BankAccount002 yoon = new BankAccount002();
		BankAccount002 park = new BankAccount002();
		// 각 인스턴스에 데이터 기능이 따로 존재
		yoon.deposit(5000); // 계좌에 입금
		// yoon 계좌
		System.out.println("yoon의 계좌 잔액 >> " + yoon.checkMyBalance()); 
		// park 계좌
		System.out.println("park의 계좌 잔액 >> " + park.checkMyBalance());
		
		// 인스턴스를 대입하고 있는 변수: 참조변수
		// 참조변수의 특성
		BankAccount002 kim = new BankAccount002();// kim 계좌 생성
		kim.deposit(3000);
		kim.checkMyBalance(); // 3000
		BankAccount002 ref1 = kim;
		ref1.checkMyBalance(); // 3000
		
		check(yoon);
		check(park);
		check(kim);
		check(ref1);
		
		BankAccount bankAccount = new BankAccount();
//		check(bankAccount); // -error: 사용 불가. 데이터 타입이 맞아야 함
		check(new BankAccount002());
		
		int num1 = 42;
		getInt(num1); // 42
		getInt(42);
		
		// 객체에 null 대입 가능
		BankAccount002 choi = null;
		choi = new BankAccount002();
		// null 저장 유무에 대한 비교 연산 가능
		BankAccount002 ref3 = null;
		if (ref3 == null) {
			ref3 = new BankAccount002();
		}
//		BankAccount002 ref4 = new BankAccount(); // X 데이터 타입이 일치해야 함
//		BankAccount002 ref5 = new Book(); // X 데이터 타입이 일치해야 함
	}
	
	
	
	public static void check(BankAccount002 acc) {
		// acc = yoon;
		acc.checkMyBalance();
	}
	
	public static void getInt(int num) {
		System.out.println(num);
	}

}
