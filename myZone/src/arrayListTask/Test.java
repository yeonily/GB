package arrayListTask;

public class Test {
	public static void main(String[] args) {
		Singer taeyeon = new Singer();
		Singer hyoyeon = new Singer();
		Singer yooa = new Singer();
		Singer sooyeong = new Singer();
		
		taeyeon.setAge(30);
		taeyeon.setName("태연");
		taeyeon.setGroup("소녀시대");
		taeyeon.setPosition("보컬");
		taeyeon.setNumber(1);
		
		yooa.setAge(25);
		yooa.setName("유아");
		yooa.setGroup("오마이걸");
		yooa.setPosition("댄서");
		yooa.setNumber(3);
		
		hyoyeon.setAge(30);
		hyoyeon.setName("효연");
		hyoyeon.setGroup("소녀시대");
		hyoyeon.setPosition("댄서");
		hyoyeon.setNumber(2);
		
		sooyeong.setAge(29);
		sooyeong.setName("수영");
		sooyeong.setGroup("소녀시대");
		sooyeong.setPosition("댄서");
		sooyeong.setNumber(4);
		
		Stage stage = new Stage();
		
		stage.add(yooa);
		stage.add(hyoyeon);
		stage.add(taeyeon);
		
		System.out.println(yooa);
		System.out.println(hyoyeon);
		System.out.println(taeyeon);
		System.out.println(Stage.singers);
		
//		stage.delete("유아");
//		System.out.println(stage.singers);
		
		System.out.println(stage.avgCheck());
		
		if(stage.agecompare(35)) {
			System.out.println("평균나이보다 작다");
		}else {
			System.out.println("평균나이보다 많다");
		}
		
		System.out.println(stage.ageListSearch(30));
		System.out.println(stage.positionListSearch("댄서"));
		
		hyoyeon.setAge(35);
		stage.ageUpdate(hyoyeon);
		System.out.println(Stage.singers);
		
		stage.ageSort();
		System.out.println(Stage.singers);
		
		stage.numSort();
		System.out.println(Stage.singers);

//		stage.nameSort();
//		System.out.println(Stage.singers);
		
		System.out.println(stage.groupCheck("태연"));
		System.out.println(stage.groupCheck("유아"));
		System.out.println(stage.positionSearch("댄서"));
		
		yooa.setPosition("래퍼");
		stage.positionUpdate(yooa);
		System.out.println(Stage.singers);
		
		stage.add(sooyeong);
		System.out.println(stage.countCheck("댄서")+"명");
		
		
	}

}
