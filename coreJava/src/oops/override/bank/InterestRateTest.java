package oops.override.bank;

public class InterestRateTest {
	public static void main(String[] args) {
		// StandChar sc = new StandChar();
		// System.out.println("StandChart Rate :" + sc.getRate());// static
		// binding
		//
		// NicAsia na = new NicAsia();
		// System.out.println("NicAsia Rate :" + na.getRate());// static binding
		//
		// Nabil nbl = new Nabil();
		// System.out.println("Nabil Rate :" + nbl.getRate());// static binding
		Bank b = new Nabil();
		Bank na = new NicAsia();
		Bank sc = new StandChar();
		getData(b);
		getData(na);
		getData(sc);
	}

	private static void getData(Bank bank) {
		System.out.println("Bank Rate" + bank.getRate());// late binding or
															// dynamic binding
															// we cannot predict
															// early which
															// getRate() is
															// called
	}
}
