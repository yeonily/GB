package bankReview;
	
//기업(재정의, super)
//입금 시 수수료 50%
public class Kiup extends Bank{
	@Override
	public void deposit(int money) {
		money *= 0.5;
		super.deposit(money);
	}
}
