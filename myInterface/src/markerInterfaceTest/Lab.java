package markerInterfaceTest;

public class Lab {
//	외부에서 모든 동물을 받아와서 
//	초식동물인지 육식동물인지 잡식동물인지 구분하는 메소드
//	초식동물 : Herbivore
//	육식동물 : Carnivore
	public void checkKinds(Animal[] animals) {
		
//		외부에서 Animal 타입의 배열을 전달받고
//		instanceof를 사용하여 종을 검사한다.
		//인터페이스도 타입이고, 부모이므로, instanceof 사용 가능
		//객체의 타입이 육식으로 묶였는지, 초식으로 묶였는지 구분해서 확인하기
		
		//animals 길이만큼 반복문
		for (int i = 0; i < animals.length; i++) {
			//animals에 들어 있는 동물이 초식동물이니?
			if(animals[i] instanceof HerbivoreMarker) {
				System.out.println("초식동물입니다");
				//animals에 들어 있는 동물이 육식동물이니?
			}else if(animals[i] instanceof CarnivoreMarker){
				System.out.println("육식동물입니다");
				//그외
			}else {
				System.out.println("잡식동물입니다");
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
//checkKinds 메소드는 Lab클래스 필드니까 Lab타입의 객체화를 통해서 접근해야 함.
		//checkKinds메소드가 static이면 객체화 하지 않아도 됨.
		//객체화
		Lab l = new Lab();
		//동물 배열안에 자식 생성자 넣기 
		Animal[] animals = {
				new Bear(), //animal 클래스에 상속되어 있으니까 upcasting으로 animal 타입의 배열 만들어짐
				new Cow(),
				new Dog(),
				new Tiger()
		}; //부모 타입으로 업캐스팅
		
		//checkKinds 메소드 사용
		l.checkKinds(animals);
	}
}
