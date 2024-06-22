package start;

class YoungerAge extends RuntimeException{
	YoungerAge(String msg){
		super(msg);
	}
}
public class ThrowExc {

	public static void main(String[] args) {
		int age=24;
		if(age<18) {
			throw new YoungerAge("You are not eligible to vote");
		}
		else {
			System.out.println("You are eligible to vote");
		}

	}

}
