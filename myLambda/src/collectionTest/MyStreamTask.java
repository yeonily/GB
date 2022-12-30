package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyStreamTask {

	public static void main(String[] args) {
		ArrayList<String> datas = new ArrayList<String>();
		datas.add("A");
		datas.add("B");
		datas.add("C");
		datas.add("D");
		datas.add("E");
		datas.add("F");
		
//      1~10까지 ArrayList에 담고 출력
		ArrayList<Integer> results = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(results::add);
		System.out.println(results);
		
//      1~100까지 중 홀수만 ArrayList에 담고 출력
		results = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 100).filter(n -> n % 2 != 0).forEach(results::add);
		System.out.println(results);
		
//      ABCDEF를 각 문자별로 출력
		String data = "ABCDEF";
		data.chars().forEach(alpha -> System.out.println((char)alpha));
		
//      A~F까지 ArrayList에 담고 출력
		ArrayList<String> output1 = (ArrayList<String>)datas.stream().collect(Collectors.toList());
//		IntStream.rangeClosed('A', 'F').forEach(alpha -> System.out.println((char)alpha));
		
		System.out.println(output1);
		
//      A~F까지 중 D제외하고 ArrayList에 담고 출력
		ArrayList<String> result5 = new ArrayList<String>();
		IntStream.rangeClosed('A', 'F').filter(a -> a % 4 != 0).forEach(alpha -> result5.add(""+(char)alpha));
		
		System.out.println(result5);
		
//      5개의 문자열을 입력받은 후 모두 소문자로 변경(String.toLowerCase())
		ArrayList<String> datass = new ArrayList<String>(Arrays.asList("ABCDE", "QWER", "OPP", "zimLI", "JKluiO"));
		ArrayList<String> resultss = new ArrayList<String>();
		datass.stream().map(str -> str.toLowerCase()).forEach(resultss::add);
		System.out.println(resultss);
		
//      Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력
		ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
		fruits.stream().filter(a -> a.charAt(0) < 91).forEach(System.out::println);
		
//      한글을 정수로 변경
		String hangle = "공일이삼사오육칠팔구";
		String str = "칠팔일공";
		str.chars().map(a -> hangle.indexOf(a)).forEach(System.out::print);
		
		System.out.println();
//      정수를 한글로 변경
		String number = "0123456789";
		ArrayList<String> hanglee = new ArrayList<String>(Arrays.asList("공","일","이","삼","사","오","육","칠","팔","구"));
		String getNum = "298";
		getNum.chars().map(n -> number.indexOf(n)).forEach(n -> System.out.print(hanglee.get(n)));
	}

}
