package arrayListTask;

public class Food {
//	이름, 가격, 종류(한식,중식,일식,양식)
//	private
//	기본생성자
//	toString()
	
	private String name;
	private int price;
	private String kind;
	
	public Food() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
		public String toString() {
			String str = name + "," + price + "," + kind;
			return str;
		}
	
}
