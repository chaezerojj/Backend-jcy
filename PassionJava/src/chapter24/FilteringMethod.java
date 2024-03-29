package chapter24;

import java.util.Arrays;
import java.util.List;

public class FilteringMethod {
	public static void main(String[] args) {
		// 필터링
		// : 스트림을 구성하는 데이터 중 일부를 조건에 따라 걸러내는 연산
		// - filter() - boolean test(T t) 추상 메소드를 가지고 있음
		//          >> 리턴 문에서 true인 경우만 걸러내어 스트림 생성
		// - 만약 문자열 길이가 3을 통과시키는 코드를 작성한다면
		List<String> sl = Arrays.asList("Apple", "banana", "orange");
		sl.stream() 
			.filter(s -> s.length()==3)
			.forEach(s -> System.out.println(s));
		// 메소드를 온점으로 연결하여 사용 >> 메소드 체이닝 (method chaining)
		
		
		
	}

}


