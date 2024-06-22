package Start;

	interface RBI {
	double getRateOfInterest();
	}
    class SBI implements RBI{
		public double getRateOfInterest() {
			return 8.5;
		}
    	
    }
    
    class PNB implements RBI{
		public double getRateOfInterest() {
			return 9;
		}
    
    
    public class Bank{
    	public static void main(String args[]) {
    		SBI s = new SBI();
    		PNB p = new PNB();
    		
    		System.out.println("Rate of Interest for SBI: " + s.getRateOfInterest()+ "%");
    		System.out.println("Rate of Interest for PNB: " + p.getRateOfInterest()+ "%");
    	}
    }
    }
