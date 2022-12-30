package myCollectionTask;

public class User {
	private String name;
	private String id;
	private String password;
	private int phoneNum;
	//private은 메소드로만 접근해라

	//게터세터 메소드 만들어주기
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public User(){;}
	
	@Override
	public String toString() {
		return name+", "+id+", "+password+", "+phoneNum;
	}
	
	
}
