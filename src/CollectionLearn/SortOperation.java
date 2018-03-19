package CollectionLearn;
import java.util.*;

public class SortOperation {

	public static void main(String args[]){
	List<String> list=new LinkedList<String>();
	list.add("john");
	list.add("abi");
	list.add("nisha");
	list.add("banu");
	
	Collections.sort(list);
	Collections.sort(list);

	
	//Collections.addAll(c, elements);
	for(String str:list){
		System.out.println(str);
	}
	List<Customer> custlist=new ArrayList<Customer>();


	Customer c1=new Customer(1001,"jhon",1233);
	Customer c2=new Customer(1002,"joh",1211);
	Customer c3=new Customer(1003,"john",1200);


	custlist.add(c2);
	custlist.add(c3);
	custlist.add(c1);
	
	for(Customer c: custlist){
		System.out.println(c);
	}
	//Collections.sort((List<Customer>) custlist);
	Collections.sort(custlist,new CustomerIdSort());
	System.out.println("sorted list");
	for(Customer c: custlist){
		System.out.println(c);
	}
	

	
}
}