package start;

public class StringCharAt {

	public static void main(String[] args) {
//		String s="Railworld";
//		char ch=s.charAt(5);
//		System.out.println(ch);
        
//		String s = "Railworld";
//		int sLength = s.length();
//	    System.out.println("Character at 0 index is: " + s.charAt(0));
//	    System.out.println("Character at last index is: " +s.charAt(sLength-1));
	    String s="Railworld";
	    for(int i=0;i<s.length();i++) {
	    	if(i%2==0) {
	    		System.out.println("Char at"+i+"place"+s.charAt(i));
	    	}
	    }
	}
	

}
