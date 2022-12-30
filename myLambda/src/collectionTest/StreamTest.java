package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {//내부 API 이름이 Stream

	public static void main(String[] args) {
//		forEach()
		HashMap<String, Integer> chinaTown = new HashMap<String, Integer>();
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		chinaTown.put("짜장면", 3000);
		chinaTown.put("짬뽕", 4000);
		chinaTown.put("탕수육", 8000);
		
//		chinaTown.values();//여러개의 값들이 있는 친구들은 Stream을 붙이면 Stream으로 바뀜(iterator처럼)
		chinaTown.values().stream().forEach(price -> System.out.println(price));
		//map	//collection타입 //stream타입 //stream필드에 forEach메소드 사용하려고  
		//익명메소드 람다식으로 구현(price(매개변수)저장공간 -> price(실행할 문장)값)
		
		//forEach : Consumer를 매개변수로 받음. Consumer는 함수형 인터페이스 accept 추상메소드 선언
		//accept 메소드를 구현해야 사용 가능 >> 람다식으로 구현
		
		//람다식 안 쓰려면
		//forEach안에 이렇게 써야 함.
//		new Consumer<Integer>() {
//			public void accept(Integer price) {
//				 
//			};
//		};
		 
		
		chinaTown.values().forEach(price -> System.out.println(price));
		//너무 많이 써서 collection에서도 forEach사용 가능
		chinaTown.values().forEach(System.out::println);
		
		datas.add(10);
		datas.add(20);
		datas.add(30);
		datas.add(40);
		datas.add(50);
		
		//반복문을 람다식으로 한줄로 표현
		datas.forEach(value -> System.out.println(value)); //여러 개 문장이 실행되어야 하면 중괄호 안에(지양) 
//		전달받은 매개변수를 그대로 메소드에 사용할 경우에는 참조형 문법을 사용할 수 있다.
//		소속::메소드명 --> 전달받은 값을 메소드의 매개변수로 바로 전달해준다.
		datas.forEach(System.out::println);//바로 값을 표현할 때 참조형으로 쓰기
		
		//StreamAPI 쓰는 이유는 간결하게 쓰기 위함. 람다식 구현하는 코드가 길어지면 목적에 맞지 않게 쓰는 것임.
		
		//범위
//		IntStream.range()
		IntStream.range(1, 10).forEach(System.out::println);; //1~9
		
//		IntStream.rangeClosed()
		//1~10까지 출력
		IntStream.rangeClosed(1, 10).forEach(System.out::println); //1~10
		
		
//		chars() : 문자열을 IntStream으로 변경
		//문자 배열을 stream으로 바꿔준다고 생각하기
		String data = "ABC"; //3칸 문자 배열
		data.chars().forEach(System.out::print);//여기서 출력하면 정수값이 나옴. 자동으로 int로 바뀜.
		System.out.println();
		data.chars().forEach(number -> System.out.print((char)number));
		System.out.println();
		
		
//		map() : 기존 값을 원하는 값으로 변경
		//원래 있던 값을 다른 값으로 변경할 때 사용
		String mapData = "ABC";
		mapData.chars().map(number -> number + 3).forEach(v -> System.out.print((char)v));
		System.out.println();
		
		
//		filter() : 조건식을 작성하여 false일 경우 제외시킨다.
		IntStream.rangeClosed(1, 10).filter(number -> number % 2 == 0).forEach(System.out::println);
										//참일 때만 실행, 필터 안에다가 전달할 값을 구현한 것임. 필터 매개변수를 구현한 것임.
										
//		sorted()
		Integer[] arData = {10, 40, 20, 30}; // 배열을 arraylist로 바꿀 수 있는 방법
		ArrayList<Integer> sortDatas = new ArrayList<Integer>(Arrays.asList(arData)); //aslist(배열의 시작주소)
//		ArrayList<Integer> sortData = new ArrayList<Integer>(Arrays.asList(10, 40, 20, 30)); //직접 넣어줘도 됨 
		System.out.println(sortDatas);
		
		//자동완성이 바로 안 뜨면 Stream을 쓰고 하기!
		sortDatas.stream().sorted().forEach(System.out::println); //오름차순 정렬이 되어서 출력됨
		sortDatas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println); //내림차순 정렬이 되어서 출력함.
//		자료형... >> 가변인자(몇 개의 값이 들어올 지 모를 때)
		
//		collect() : 결과를 다양한 타입(문자열, list, map 등)으로 리턴해준다.
		ArrayList<Integer> results =
				(ArrayList<Integer>)sortDatas.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
				//타입 같에 맞춰주기																//앞에 값을 list담아서 리턴하겠다 > list타입으로 바뀜
		System.out.println(results);
		
		//문제푸는 순서, 알고리즘이 중요
		//문자열로 리턴
//		Collectors.joining("구분점");
//		문자열 타입의 값을 원하는 구분점으로 연결하여 리턴한다.
//		문자열 타입이 아닌 값은 joining을 사용할 수 없다.
		String result = sortDatas.stream().sorted().map(String::valueOf).collect(Collectors.joining(" "));
													//String으로 박싱(참조형으로 표현)
		System.out.println(result);
	}

}
