//write a java program to compare two array lists.
package TestProgram;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		list.add("Apple");
		list.add("pinaple");
		list.add("Water mallon");
		list.add("Bannana");
		list.add("Strobery");
		
		System.out.println("first array list:"+list);
		
		List<String> list1=new ArrayList<String>();
		
		list1.add("Apple");
		list1.add("pinaple");
		list1.add("water mallon");
		list1.add("strobery");
		System.out.println("2nd array list:"+list1);
		
		for(String i:list) {
			if(list1.contains(i))
				System.out.println("yes"+i+"it mens yes");
			else
				System.out.println("no"+i+"it means no");
		}

	}

}
