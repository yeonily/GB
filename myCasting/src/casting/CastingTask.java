package casting;

import java.util.Scanner;

class Video{
	
}

class Animation extends Video{
	void printSubtitles() {
		System.out.println("자막지원");
	}
}

class Movie extends Video{
	void view4D() {
		System.out.println("4D");
	}
}

class Drama extends Video{
	void giveGoods() {
		System.out.println("굿즈");
	}
}

public class CastingTask {
//	넷플릭스
//	애니메이션, 영화, 드라마 클래스 선언
//	사용자가 선택한 영상이
//	애니메이션이라면 "자막지원"기능 사용
//	영화라면 "4D"기능 사용
//	드라마라면 "굿즈"기능 사용
	
	
	public void check(Video video) {
		if(video instanceof Animation) {
			Animation ani = (Animation) video;
			ani.printSubtitles();
		}else if(video instanceof Movie) {
			Movie movie = (Movie) video;
			movie.view4D();
		}else {
			Drama drama = (Drama) video;
			drama.giveGoods();
		}
		
	}
	
	public static void main(String[] args) {
		
		CastingTask ct = new CastingTask();
		
		ct.check(new Drama());
		
		
				
				
		
		
		
		
	}
		
}
