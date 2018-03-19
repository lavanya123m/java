package CollectionLearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myset=new HashSet<String>();
		myset.add("john");
		myset.add("lavanya");
		myset.add("peter");
		myset.add("peter");
	
		Set<String> myset1=new TreeSet<String>(myset);
		
		for(String s:myset){
			System.out.println(s);
		}
		System.out.println("after sorting");
		for(String s:myset1){
			System.out.println(s);
		}
		
		List<String> mylist2= new ArrayList<String>(myset);
		Collections.sort(mylist2);
		for(String s:mylist2){
			System.out.println(s);
		}
		
	}

}
