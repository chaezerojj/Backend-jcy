package chapter17.Quiz3;

import java.util.Scanner;

// 이름, 주민번호 앞 6자리, 전화번호 입력 받아 출력

public class ScanExample02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 주민번호 앞 6자리, 전화번호를 입력하세요.");
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("주민번호 앞 6자리: ");
		int num = sc.nextInt();
		System.out.println("전화번호입력: ");
		String phoneNumber = sc.nextLine();
		
		System.out.println(name);
		System.out.println(num);
		System.out.println(phoneNumber);
	}

}
