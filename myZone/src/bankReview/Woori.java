package BankReview;

//우리(재정의, super)
//잔액 조회시 재산 반토막
public class Woori extends Bank{
	@Override
	public int walletSearch() {
		//private 변수니까 게터세터 쓰기
		setMoney(getMoney() / 2);
		return super.walletSearch();
	}
}
