package start;

public class StringBufferDemo {

	public static void main(String[] args) {
		
//		StringBuffer sb= new StringBuffer("Railworld");
//		sb.append("Amazon");
//		System.out.println(sb);
//		System.out.println(sb.length());
//		
//
		StringBuilder sb = new StringBuilder("hello");
		StringBuilder sb1 = new StringBuilder("hello");
		if (sb.equals(sb1)) {
		System.out.println("true");
		}else {
		System.out.println("false");
		}
	}	
}