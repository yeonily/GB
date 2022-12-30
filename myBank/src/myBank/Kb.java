package myBank;

public class Kb extends Bank {
	@Override
	void withdraw(int money) {
		money /= 2;
		super.withdraw(money);
//		account -= (money * 0.5);
	}
}
