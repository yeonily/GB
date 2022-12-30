package dateTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.SimpleFormatter;

public class CalendarTest {

	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd aaa hh:mm:ss");
//		Calendar today = Calendar.getInstance();
//		System.out.println(today);
//		System.out.println(simpleDateFormat.format(today.getTime()));
															//Date타입으로 바꿔주는 메소드
		
		Calendar date = Calendar.getInstance();
		//수정
//		date.set(2000, 11, 04);
		//month는 0~11로 되어 있음.
//		date.set(Calendar.YEAR, 2020);//하나만 바꾸고 싶을 때 사용
				//static final로 정해져 있음.
		
		//가져오기
		System.out.println(date.get(Calendar.YEAR));
		System.out.println(date.get(Calendar.MONTH) +1); // MONTH는 0~11이니까 결과에 +1해줘야 함.
		
		
//		System.out.println(simpleDateFormat.format(date.getTime()));
		
	}

}
