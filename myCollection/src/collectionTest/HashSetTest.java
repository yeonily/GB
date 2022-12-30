package collectionTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> bloodTypes = new HashSet<String>();
		ArrayList<String> bloodTypeList = null;
		
		bloodTypes.add("A");
		bloodTypes.add("B");
		bloodTypes.add("O");
		bloodTypes.add("AB");
		
		bloodTypeList = new ArrayList<String>(bloodTypes);
		
		System.out.println(bloodTypeList.get(0));//arraylist로 순서를 부여해서 활용하면 됨
		
//		//중복검사를 알아서 해줌
//		System.out.println(bloodTypes);
//		
//		Iterator<String> iter = bloodTypes.iterator();
//		
//		while(iter.hasNext()) {
//			System.out.println(iter.next()); 
//		}
		
	}

}
