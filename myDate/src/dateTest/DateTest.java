package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		Date date = new Date();
		Date time = new Date();
		
		date.setYear(100); // 기본적으로 +1900가 되어 있음.
		date.setMonth(12); // 0~11 >> 1~12월로 설정되어 있음.
		
		System.out.println(date); 
		System.out.println(simpleDateFormat.format(date));
		
		try {
			time = simpleDateFormat.parse("2002년 12월 04일 09시 00분 10초");
			//parse exception 발생 >> try-catch로 잡아주기
			System.out.println(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
			
	}
	
}
