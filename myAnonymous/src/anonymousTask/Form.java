package anonymousTask;

//양식 틀만 만들어놓기 >> 인터페이스
//틀은 스타벅스가 아닌 빌딩에서 선언(구현)해야 함.
public interface Form {
	public String[] getMenu(); //메뉴판 받아오기
	public void sell(String order); //판매방식 받아오기, 매개변수로 주문받아와야 함.
	
}
