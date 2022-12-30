package myBank;

public class Woori extends Bank{
	@Override
	void deposit(int money) {
		money *= 0.5;
		super.deposit(money);
//		Account -= (money * 0.5);
	}
}
