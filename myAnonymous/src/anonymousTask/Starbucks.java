package anonymousTask;

public class Starbucks {
	//각각 지점별로 등록하기 메소드를 사용해야 함
	//각각 지점별로 작성한 양식이 필요함. 양식은 익명클래스이니까 지점에서 구현을 해야함.
	//매개변수로 구현된 필드의 주소값이 들어옴.
	
	//등록하기 메소드, 매개변수로 양식을 받아옴
	public void register(Form form) {
		//아래와 같이 양식을 검사함.
		String[] menus = form.getMenu();//양식에 있는 메뉴판을 전달받음
		
		System.out.println("---메뉴---");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(i+1+". "+menus[i]); //메뉴판 출력
			
		}
		
		//어댑터타입이라면
		if(form instanceof FormAdapter) {
			//무료나눔행사중임을 출력
			System.out.println("무료 나눔 행사중");
			return; //void일 경우엔 return을 비워두면 됨
			//if문에 들어갔을 때 그 즉시 메소드를 종료 시키기 위해서 return 사용, (else대신)
		}
		form.sell("카푸치노"); //판매
	}
	
	
}

