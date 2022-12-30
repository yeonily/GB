package bakery;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Bakery {
	public static void main(String[] args) {
		BreadMaker breadMaker = new BreadMaker();
		//자원, 러너블 타입
		//start쓰려면 thread타입으로 바꿔야 함.
		
		Thread maker = new Thread(breadMaker);
		//maker가 스케줄링 해주려면
		
		BreadPlate breadPlate = BreadPlate.getInstance();
		String[] btns = {"빵 먹기", "나가기"};
		int choice = 0;
		
		ImageIcon icon = new ImageIcon("src/img/bread.gif");//default경로는 프로젝트 경로임. 추가 경로를 써줘야 함.
		
		maker.start(); //콘솔에서 빵먹고
		
		while(true) {
			choice = JOptionPane.showOptionDialog(null, "", "빵집", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, btns, null);
			//
			
			if(choice == 0) {
				breadPlate.eatBread();
			}else {
				System.exit(0); // 프로세스 종료
//				maker.interrupt();
//				break;
			}
			
		}
		
	} 

}
