package arrayListTask;

public class Love {
	//이름, 나이
	//private
	//기본 생성자
	//toString()
	
	private String name;
	private int age;
	private int index;
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Love() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		String str = index + "," + name + "," + age;
		return str;
	}
}
