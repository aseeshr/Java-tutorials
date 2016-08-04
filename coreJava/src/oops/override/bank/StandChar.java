package oops.override.bank;

public class StandChar extends Bank {
	@Override
	protected int getRate() {
		return 15;
	}
}
