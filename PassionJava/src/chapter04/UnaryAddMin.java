package chapter04;

public class UnaryAddMin {

	public static void main(String[] args) {
		//? 단항 연산자
		// 피연산자가 1개인 연산자
		// ex) A > B (피연산자가 2개)
		// ex) +A, -B (단항연산자)
		
		// 1. 부호 연산자
		// +연산자는 생략 가능
		int n1 = +1;
		int n2 = -1;
		int n3 = 1;
		int n4 = -n3;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n4); // -1
		System.out.println(-n4); // 1
		
		// 2. 증가 감소 연산자
		// ++ >> 1씩 증가시킨다
		// -- >> 1씩 감소시킨다
		// - prefix >> val = ++n; / val = --n;
		// - postfix >> val = n++; / val = n--;
		int n5 = 1;
		System.out.println("++n5: " + ++n5); // 2
		System.out.println("++n5: " + ++n5); // 3
		System.out.println("++n5: " + ++n5); // 4
		System.out.println("++n5: " + ++n5); // 5
		// n5가 1씩 증가
		System.out.println("--n5: " + --n5); // 4
		System.out.println("--n5: " + --n5); // 3
		System.out.println("--n5: " + --n5); // 2
		// n5가 1씩 감소
		
		System.out.println("n5++: " + n5++); // 2
		System.out.println("n5++: " + n5++); // 3
		System.out.println("n5++: " + n5++); // 4
		System.out.println("n5++: " + n5++); // 5
		System.out.println(n5); // 6
		System.out.println();
		
		// prefix >> 라인이 시작할 때 증가
		// postfix >> 라인이 끝난 후 증가
		
		int n6 = 1;
		System.out.println("n6 : " + n6);
		System.out.println("++n6 : " + ++n6);
		System.out.println();
		
		int n7 = 1;
		System.out.println("n7 : " + n7);
		System.out.println("n7++ : " + n7++);
		System.out.println("n7 : " + n7);
		
		
		
		
		
		
		
	}

}
