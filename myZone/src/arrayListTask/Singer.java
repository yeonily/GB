package arrayListTask;

public class Singer {
	//이름, 그룹, 포지션, 나이
	//private
	//기본 생성자
	//toString()
	
	private String name;
	private String group;
	private String position;
	private int age;
	private int number;
	
	public Singer() {
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		String str = number + "," + name + "," + group + "," + position + "," + age;
		return str;
	}
	
	
}
