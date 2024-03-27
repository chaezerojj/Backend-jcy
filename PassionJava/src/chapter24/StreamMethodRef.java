package chapter24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethodRef {
	public static void main(String[] args) {
		// words list
		List<String> words = Arrays.asList("apple", "banana", "grape", "orange", "pineapple");
		
		// 스트림 메소드 종류
		// 1. filter()
		// - 주어진 조건에 맞는 요소들로 구성된 스트림을 반환
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> evenNum = numList.stream()
								.filter(num -> num % 2 == 0)
								.collect(Collectors.toList());
		System.out.println("filter(): " + evenNum);
		
		// 2. map()
		// - 각 요소를 특정 함수에 적용하여 새로운 요소를 매핑 후, 새로운 스트림 반환
		List<String> nameList = Arrays.asList("홍길동", "김길동", "박길동");
		List<Integer> namelen = nameList.stream()
								.map(String::length)
								.collect(Collectors.toList());
		System.out.println("map(): " + namelen);
		
		// 3. flatMap()
		// - 각 요소를 스트림으로 매핑하고, 이를 단일 스트림으로 평면화하여 반환
		List<List<Integer>> nestedList = Arrays.asList(
							Arrays.asList(1, 2, 3),
							Arrays.asList(4, 5, 6),
							Arrays.asList(7, 8, 9)
							);
		// 중첩된 리스트를 평면화하여 하나의 스트림을 반환함
		List<Integer> flattenedList = nestedList.stream()
										.flatMap(List::stream)
										.collect(Collectors.toList());
		System.out.println("flatMap(): " + flattenedList);
		
		// 4. forEach()
		// - 각 요소에 대해 특정 작업을 실행
		nameList.stream()
			.forEach(System.out::println); // nameList에 있는 이름 하나씩 출력
		
		// 5. collect(Collectors)
		// - 스트림의 요소를 수집하여 리스트, 맵 등의 자료구조를 반환
		String concatenated = nameList.stream()
								.collect(Collectors.joining(", "));
		System.out.println("collect(): " + concatenated); // 문자열 리스트를 쉼표로 연결하여 하나의 문자열로 출력
		
		// 6. reduce()
		// - 스트림의 요소를 하나로 줄이는 연산을 수행
		// - e.g., 모든 요소를 합산하거나 최댓값 or 최솟값 찾기 가능
		int sum = numList.stream()
						.reduce(0, Integer::sum);
		System.out.println("reduce(): " + sum);
		
		// 7. distinct()
		// - 중복된 요소를 제거한 스트림을 반환
		List<Integer> withDuplicates = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
		List<Integer> distinctNumbers = withDuplicates.stream()
										.distinct()
										.collect(Collectors.toList());
		System.out.println("distinct(): " + distinctNumbers);
		
		// 8. sorted()
		// - 스트림 요소를 정렬한 새로운 스트림을 반환
		List<Integer> unsorted = Arrays.asList(3, 1, 4, 5, 2);
		List<Integer> sortedNumbers = unsorted.stream()
									.sorted()
									.collect(Collectors.toList());
		System.out.println("sorted(): " + sortedNumbers);

		// 9. limit()
		// - 스트림 요소의 개수를 제한
		List<Integer> limited = numList.stream()
								.limit(3)
								.collect(Collectors.toList());
		System.out.println("limited(): " + limited);
		
		// 10. skip()
		// - 처음 몇개의 요소를 건너뛴 후, 나머지 요소로 이루어진 새로운 스트림을 반환
		List<Integer> skipped = numList.stream()
								.skip(2)
								.collect(Collectors.toList());
		System.out.println("skipped(): " + skipped);
		
		// 11. anyMatch(), allMatch(), noneMatch()
		// - 각각 하나 이상의 요소가 주어진 조건과 일치하는지, 
		//   모든 요소가 조건과 일치하는지, 혹은 하나도 일치하지 않는지를 검사
		//   모든 요소가 조건과 일치하는지, 하나도 일치하지 않는지를 검사
		// anyMatch()
//		List<String> words = Arrays.asList("apple", "banana", "grape", "orange", "pineapple");
		boolean result = words.stream()
						.anyMatch(word -> word.startsWith("a"));
		System.out.printf("anyMatch(): ");
		if (result) System.out.println("리스트에 'a'로 시작하는 단어가 존재합니다.");
		else System.out.println("리스트에 'a'로 시작하는 단어가 존재하지 않습니다.");
		
		// allMatch()
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
		// 모든 요소가 짝수인지 검사
		boolean result1 = numbers.stream()
						.allMatch(num -> num % 2 == 0);
		System.out.printf("allMatch(): ");
		if (result1) System.out.println("모든 요소가 짝수입니다.");
		else System.out.println("짝수가 아닌 요소가 존재합니다.");
		
		// noneMatch()
//		List<String> words = Arrays.asList("apple", "banana", "grape", "orange", "pineapple");
		// "z"를 포함하는 문자열이 없는지 검사
		boolean result2 = words.stream()
							.noneMatch(word -> word.contains("z"));
		System.out.printf("noneMatch(): ");
		if (result2) System.out.println("리스트에 'z'를 포함하는 단어는 존재하지 않습니다.");
		else System.out.println("리스트에 'z'를 포함하는 단어가 존재합니다.");
		
		// 12. findFirst(), findAny()
		// - 스트림에서 첫번째 요소 혹은 임의의 요소를 찾아서 optional 객체로 반환
		// findFirst()
		List<Integer> numFind = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> first = numFind.stream().findFirst();
		System.out.printf("findFirst(): ");
		if(first.isPresent()) System.out.println("첫번째 요소: " + first.get());
		else System.out.println("리스트가 비어있습니다.");
		
		// findAny()
		Optional<Integer> any = numFind.stream().findAny();
		System.out.printf("findAny(): ");
		if (any.isPresent()) System.out.println("임의의 요소: " + any.get());
		else System.out.println("리스트가 비어있습니다.");
		
		// 13. min(), max()
		// - 스트림에서 최솟값 or 최댓값을 찾아서 optional 객체로 반환
		// min()
		Optional<Integer> min = numList.stream()
									.min(Integer::compareTo);
		if (min.isPresent()) {
			System.out.println("최솟값: " + min.get());
		} else {
			System.out.println("리스트가 비어있습니다.");
		}
		
		// max()
		Optional<Integer> max = numList.stream()
									.max(Integer::compareTo);
		if (max.isPresent()) {
			System.out.println("최대값: " + max.get());
		} else {
			System.out.println("리스트가 비어있습니다.");
		}
		
		// 14. toArray()
		// - 스트림의 요소를 배열로 반환
		Integer[] numberArray = numList.stream()
								.toArray(Integer[]::new);
		System.out.println("toArray(): " + Arrays.toString(numberArray));
		
		// 15. parallel()
		// - 병렬 스트림으로 변환. 요소를 병렬로 처리하여 성능을 향상시킬 수 있음 
		String[] wordsParallel = {"apple", "banana", "cherry", "date", "elderberry"};
		// 배열을 병렬 스트림으로 변환하여 요소를 대문자로 출력
		System.out.printf("parallel(): ");
		Arrays.stream(wordsParallel)
			.parallel()
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		// 16. sequential()
		// - 병렬 스트림을 순차 스트림으로 변환함
		System.out.printf("sequential(): ");
		Arrays.stream(wordsParallel)
			.parallel()
			.map(String::toUpperCase)
			.sequential()
			.forEach(System.out::println);
		
		System.out.println("===================");
		
		// 17. concat()
		// - 두 스트림을 연결하여 하나의 스트림으로 만듦
		
		// 18. peek()
		// - 각 요소를 소비하고 해당 요소를 그대로 유지함. 주로 디버깅 목적으로 사용됨
		
		// 19. forEachOrdered()
		// - 요소를 순서대로 처리함. 병렬 스트림에서 요소의 순서를 보장할 때 유용
		
		// 20. dropWhile(), takeWhile()
		// - 주어진 조건에 따라 요소를 건너뛰거나 취함 / 조건이 충족하지 않을 때까지 건너뛰거나 취함
		
		// 21. groupingBy(), partitioningBy()
		// - 요소를 그룹화하거나 분할하여 맵 형태로 반환. groupingBy는 특정 기준에 따라 그룹화하고,
		//   partitioningBy는 조건에 따라 참과 거짓으로 분할
		Map<Character, List<String>> groupByFirstLetter = words.stream()
															.collect(Collectors.groupingBy(word -> word.charAt(0)));
		System.out.println("groupingBy(): " + groupByFirstLetter);
		
		Map<Boolean, List<String>> partitionedByLength = words.stream()
														.collect(Collectors.partitioningBy(word -> word.length() > 5));
		System.out.println("partitiondedBy(): " + partitionedByLength);
		
		// 22. toSet(), toMap(), toCollection()
		// - 스트림의 요소를 집합, 맵, 또는 다른 컬렉션으로 변환
		// toSet()
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 3, 4, 5, 5);
		List<Integer> uniqueNumbers = numbers1.stream()
									.collect(Collectors.toSet())
									.stream()
									.collect(Collectors.toList());
		System.out.println("toSet(): " + uniqueNumbers);
		
		// toMap()
		Map<String, Integer> wordLengthMap = words.stream()
												.collect(Collectors.toMap(word -> word, String::length));
		System.out.println("toMap() :" + wordLengthMap);
		
		// 23. flatMapToInt(), flatMapToDouble(), flatMapToLong()
		// - 요소를 기본형 스트림으로 평면화
		
		// 24. summaryStatistics()
		// - 요소의 통계 정보를 제공하는 IntSummaryStatistics, DoubleSummaryStatistics,
		//   LongSummaryStatistics를 반환
		
		// 25. empty()
		// - 빈 스트림을 생성
		
		// 26. iterate( , )
		// - 주어진 초기값으로 시작하여 주어진 연산자를 반복적으로 적용하여 요소를 생성하는 무한 스트림 생성
		
		// 27. generate()
		// - 주어진 공급자를 사용하여 요소를 생성하는 무한 스트림을 생성
		
		
		
	}
}
