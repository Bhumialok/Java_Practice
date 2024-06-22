package start;

import java.io.IOException;

public class ThrowsExc {
	void m() throws IOException{
		throw new IOException("device error");
	}
	void n() throws IOException{
		m();
	}
	void p() {
		try {
			n();
		}catch(Exception e)
		{
			System.out.println("exception handled");
		}
	}
	public static void main(String[] args) {
		ThrowsExc obj=new ThrowsExc();
		obj.p();
		System.out.println("normal flow...");
	}

}
