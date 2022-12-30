package hashSetTest;

import java.util.HashSet;

public class School {

	public static void main(String[] args) {
//		Student han = new Student(1, "한동석");
//		System.out.println(han.equals(new Student(1, "한동석")));
		
		HashSet<Student> stds = new HashSet<Student>();
		stds.add(new Student(1, "한동석"));
		stds.add(new Student(1, "한동석")); 
		//여기서도 필드가 다르니까 해쉬코드 값도 다름 >> 박살남
		//equals를 재정의 할 때 hashcode도 같이 재정의해야 함.
		
		System.out.println(stds.size());
		
	}
	
}
