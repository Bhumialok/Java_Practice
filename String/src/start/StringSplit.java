package start;

public class StringSplit {

	public static void main(String[] args) {
		String s = "company name is Railworld";
		String[] words = s.split("m");
		for(String w:words) {
			System.out.println(w);
		}
	}

}
