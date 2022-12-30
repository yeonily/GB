package variableTest;

public class Variable {

	public static void main(String[] args) {
		int age = 10;
		float interestRate = 3.55678F; //4바이트로 바꿔주려면 끝에f //금리
//		float b = 3.55678; // 실수는 8바이트 
		double compoundInterestRate = 3.55678; //복리
		char k_cow_grade = 'A';
		String data = "ABC";
				
		System.out.println(age);
		System.out.println(interestRate);
		System.out.println(compoundInterestRate);
		System.out.println(k_cow_grade);
		System.out.println(data);
	}

}
