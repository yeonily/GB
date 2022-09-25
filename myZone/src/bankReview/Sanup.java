package BankReview;

//산업(재정의, super)
//출금 시 수수료 50%
public class Sanup extends Bank{
	@Override
	public void withdraw(int money) {
		money += 1.5;
		super.withdraw(money);
	}
}
