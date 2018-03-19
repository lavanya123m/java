package CollectionLearn;

import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> mylist=myWebService();
		int val1=mylist.get(0);
		int val2=mylist.get(1);
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(mylist.size());
		System.out.println(mylist.contains(5.6));
		System.out.println(mylist.isEmpty());
		
		
		
	}
	public static List<Integer> myWebService(){
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(5);
		list.add(9);
		return list;
	}

}
