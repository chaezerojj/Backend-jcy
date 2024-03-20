package chapter11.Quiz;

public class Exercise6_18 {
	public static boolean isNumber(String str) {
		if (str.equals("") || str == null) {
			return false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c < '0' || c > '9') {
				return false;
			}
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "은(는) 숫자입니까? >> " + isNumber(str));
		str = "1234o";
		System.out.println(str + "은(는) 숫자입니까? >> " + isNumber(str));
	}

}