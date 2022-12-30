package dateTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTask {

	public static void main(String[] args) {
//		본인의 생년월일 출력
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar birth = Calendar.getInstance();//지금 운영체제에서 쓰는 달력을 가지고 옴.
//		birth.set(1994, 9, 21);
		birth.set(Calendar.YEAR, 1994);
		birth.set(Calendar.MONTH, 9);
		birth.set(Calendar.DATE, 21);
		System.out.println(simpleDateFormat.format(birth.getTime()));
		
	}

}
