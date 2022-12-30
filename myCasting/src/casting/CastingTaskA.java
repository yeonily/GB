package casting;

public class CastingTaskA {
//   넷플릭스
//   애니메이션, 영화, 드라마 클래스 선언
//   사용자가 선택한 영상이
//   애니메이션이라면 "자막지원"기능 사용
//   영화라면 "4D"기능 사용
//   드라마라면 "굿즈"기능 사용

	//매개변수를 업캐스팅, 어떤 타입이 들어올 지 모르니까, 공통타입으로 받기
   public void check(Video1 video) {
	   //비디오가 애니메이션 타입이니?
	   if(video instanceof Animation1) {
		 //비디오를 애니메이션 타입으로 다운캐스팅
    	  Animation1 ani = (Animation1) video;
    	  //애니메이션 메소드 사용
         ani.printSubtitle();
         //비디오가 영화 타입이니?
      }else if(video instanceof Film1) {
    	  //비디오를 영화 타입으로 다운 캐스팅
    	  Film1 film = (Film1) video;
    	  //영화 메소드 사용
         film.print4D();
         //비디오가 드라마 타입이니?
      }else {
    	  //비디오를 드라마 타입으로 다운 캐스팅
         Drama1 drama = (Drama1) video;
         //드라마 메소드 사용
         drama.sellGoods();
      }
   }
   
   public static void main(String[] args) {
	   
      CastingTaskA ct = new CastingTaskA();
      ct.check(new Animation1());
      ct.check(new Film1());
      ct.check(new Drama1());
      //매개변수로 어떤 객체를 넣어도 부모타입이 video타입이니까 업캐스팅 됨
     
      
      
   }
}
