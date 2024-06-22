package start;

public class String_toChar {

	public static void main(String[] args) {
		String str = "Hello";
		char[] charArray = str.toCharArray();
		for(char ch: charArray) {
			System.out.println(ch);
		}
	}

}
