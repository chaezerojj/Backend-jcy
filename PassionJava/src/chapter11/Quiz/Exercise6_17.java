package chapter11.Quiz;

public class Exercise6_17 {
	//shuffle method
	public static int[] shuffle(int[] arr) {
		if(arr == null || arr.length == 0) {
			return arr;
		}
		
		for(int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random() * arr.length); // arr 랜덤 배열
			int tmp = arr[i];
			arr[i] = arr[num];
			arr[num] = tmp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5 ,6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
