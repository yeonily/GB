package bank;

public class Kiup extends Bank{
	@Override
	   public int showBalance() {
	      setMoney(getMoney() / 2);
	      return super.showBalance();
	   }
}
