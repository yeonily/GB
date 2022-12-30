package anonymousTask;

public class Building {
	//익명클래스가 열림 > 구현됨 > 구현된 필드의 주소값이 Starbucks에서 매개변수(form)로 들어감. > 사용

	public static void main(String[] args) {
		//잠실점 오픈
		//잠실점은 무료 나눔 행사중이라서 판매 방식을 구현할 필요 없다.
		//본사에서는 전달받은 양식을 검사할 때
		//무료나눔 행사중인 매장이라면 "무료 나눔 행사중" 출력하기
		
		
		//강남지점 객체화
		Starbucks gangnam = new Starbucks();
		//익명클래스가 열린 것은 > 메소드가 구현이 된 것임.
		gangnam.register(new Form() { //register에서는 구현된 필드의 주소값을 받는 것임
				 			//익명클래스는 할당된 필드의 주소값으로 봐야함!
			//register 메소드를 선언한 것이 아니라 사용한 것임.
			//메소드 뒤에 중괄호가 있으면 선언, 중괄호가 없으면 사용

			//강남점 내용으로 필드를 구현하면 됨.
			@Override
			public String[] getMenu() {
				//메뉴판 만들어서 리턴하기
				String[] menus = {"아메리카노", "카푸치노", "캐모마일티"};
				return menus;
			}

			@Override
			public void sell(String order) {
				String[] menus = getMenu(); //메뉴판을 받아와서
				//메뉴를 하나씩 메뉴배열길이만큼 돌린 다음
				for (int i = 0; i < menus.length; i++) {
					//주문한 거랑 메뉴랑 일치하는 게 있다면
					if(order.equals(menus[i])) {
						//판매완료
						System.out.println("판매완료");
					}
				}
			}
			
		});
		
		//잠실지점 객체화
		Starbucks jamsil = new Starbucks();
		//register 메소드의 매개변수는 Form타입이다.
		//FormAdapter는 Form의 자식타입이므로 upcasting을 통해 전달한다.
		jamsil.register(new FormAdapter() {

			//필요한 내용만 구현한다
			@Override
			public String[] getMenu() {
				String[] menus = {"뜨아", "아아", "아바라"};
				return menus;
			}

		});
		//register에서 매개변수로 들어간 값은 할당된 필드의 주소값(구현이 완료 되었으니까)
		//register 메소드는 사용한 것임.(선언x)
		
		
		
	}

}
