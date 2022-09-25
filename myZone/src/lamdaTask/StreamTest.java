package lamdaTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {

	public static void main(String[] args) {

		HashMap<String, Integer> chinaTown = new HashMap<String, Integer>();
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		chinaTown.put("짜장면", 3000);
		chinaTown.put("짬뽕", 4000);
		chinaTown.put("탕수육", 8000);
		
		
		//forEach()
		chinaTown.values().stream().forEach(price -> System.out.println(price));
		chinaTown.values().forEach(price -> System.out.println(price));
		//참조형
		chinaTown.values().forEach(System.out::println);
		
		datas.add(10);
		datas.add(20);
		datas.add(30);
		datas.add(40);
		datas.add(50);
		
		datas.forEach(value -> System.out.println(value));
		datas.forEach(value -> {//여러 개 문장이 실행되어야 하면 중괄호 안에(지양)
			System.out.print("값 : ");
			System.out.println(value);
		});
		
		datas.forEach(System.out::println);
		
		//범위 
		//Intstream.range() : 마지막 포함x
		//Intstream.rangeClosed() : 마지막 포함o
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		IntStream.rangeClosed(1, 10).forEach(System.out::print);
		System.out.println();
	
		//chars()
		String data = "ABC"; // 3칸짜리 문자배열
		data.chars().forEach(System.out::print); //자동으로 int로 바뀜.
		System.out.println();
		data.chars().forEach(number -> System.out.print((char)number)); //자동으로 int로 바뀜.
		System.out.println();
		
		//map() : 기존 값을 원하는 값으로 변경
		data.chars().map(number -> number + 3).forEach(v -> System.out.print((char)v));
		System.out.println();
		
		//filter() : 조건식을 작성하여 false일 경우 제외시킨다.
		IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).forEach(System.out::print);
		System.out.println();
		
		//sorted()
//		Integer[] arData = {10, 40, 20, 80}; 
//		ArrayList<Integer> datas1 = new ArrayList<Integer>(Arrays.asList(arData));
		ArrayList<Integer> datas1 = new ArrayList<Integer>(Arrays.asList(5, 3, 7, 1));
		System.out.println(datas1);
		datas1.stream().sorted().forEach(System.out::println); // 오름차순
		datas1.stream().sorted(Collections.reverseOrder()).forEach(System.out::println); // 내림차순
		
		//collect() : 결과를 다양한 타입으로 리턴해준다.
		ArrayList<Integer> results =
				(ArrayList<Integer>)datas1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());		
		System.out.println(results);
		
		//Collectors.joining("구분점"); 
		//문자열 타입의 값을 원하는 구분점으로 연결하여 리턴한다.
		String result = datas1.stream().sorted().map(String::valueOf).collect(Collectors.joining(" "));
		System.out.println(result);
		
		
	}

}
