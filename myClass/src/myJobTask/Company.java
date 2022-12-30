package myJobTask;

import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		Job job = new Job("designer", 50000, 0);
		Scanner sc = new Scanner(System.in);
		int actionChoice = 0;
		String action = "1.일하기\n2.만들기\n3.정보\n4.퇴근하기";
		
		while(true) {
			System.out.println(action);
			actionChoice = sc.nextInt();
			if(actionChoice == 4) {
				System.out.println("퇴근하겠습니다");
				break;
				
			}
			
			switch(actionChoice) {
			case 1:
				job.work();
				System.out.print("일하는 중");
				for (int i = 0; i < 2; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.print(".");
				}
				System.out.println("\n일한 시간 : "+job.workingTime);
				System.out.println("금융 치료 : "+job.wallet);
				break;
			case 2:
				if(job.workingTime == 2) {
					if(job.make()) {
						System.out.println("작품이 1개 완성되었습니다");
						job.workingTime = 0;
						break;
					}
					System.out.println("작품완성 실패ㅠ");
					break;
				}
				System.out.println("업무시간 부족");
				break;
			case 3:
				System.out.println("나의 직업 : "+job.name);
				System.out.println("나의 업무 시간 : "+job.workingTime);
				System.out.println("나의 통장 잔액 : "+job.wallet);
				break;
			default:
				System.out.println("다시 입력");
				break;
			}
			
		}
			
	
		
		
		
	}

}
