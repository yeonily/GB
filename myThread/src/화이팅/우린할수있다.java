package 화이팅;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 우린할수있다 {
	//코테 1번 문제
	//메소드 안 내용을 채우는 형태가 많이 나옴
	
//	public int solution(String s) {
//		String[] num = new String[s.length()];
//		num = s.split("");
//		int count = 0;
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		
//		for (int i = 0; i < num.length; i++) {
//			if(num[i].equals("1")) {
//				count++;
//			}else {
//				count = 0;
//			}
//			datas.add(count); 
//		}
//		datas.stream().sorted(Collections.reverseOrder());
//		return datas.get(0) == null ? 0 : datas.get(0) ;
//	}
	
	public int solution(String s) {
//		0을 기준으로 문자열 분리(1만 나눠서 들어감)
		ArrayList<String> datas = new ArrayList<String>(Arrays.asList(s.split("0")));
//		String[] datas = s.split("0");
//		각 세트의 "1" 개수를 담아줄 컬렉션
		ArrayList<Integer> lengths = new ArrayList<Integer>();
//		내림차순 결과를 담아줄 컬렉션
		List<Integer> result = null;
		
//		기존의 값을 길이로 변경 후 lengths에 저장
		datas.stream().map(data -> data.length()).forEach(lengths::add);
//		내림차순 후 결과를 List로 변환
		result = lengths.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
													//내림차순
//		전달받은 값이 0밖에 없으면 size()는 0이므로 0 리턴
		return result.size() == 0 ? 0 : result.get(0);
	}
	
	
	public static void main(String[] args) {
		우린할수있다 we = new 우린할수있다();
		System.out.println(we.solution("0001111000"));
	}
	
	
}
