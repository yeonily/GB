package collectionTask;

public class User {
//	- 이름, 아이디, 비밀번호, 폰번호
//	- private으로 선언
//	- 기본생성자만 선언
//	- toString() 재정의
	
	private String name;
	private String id;
	private String password;
	private String phoneNumber;
	//private은 메소드로만 접근해라
	
	public User() {;}

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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
		public String toString() {
			String str = name + ", " + id + ", " + phoneNumber;
			return str;
		}
	
	
}
