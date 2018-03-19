package CollectionLearn;

//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CustomerSetTest {
	
	public static void main(String args[]){
		Set<Customer> custlist=new TreeSet<Customer>(new CustomerIdSort());

		Customer c1=new Customer(1001,"jhon",1233);
		Customer c2=new Customer(1004,"joh",1211);
		Customer c3=new Customer(1003,"john",1200);

		
		Customer c4=new Customer(1002,"joh",1211);
		
		custlist.add(c3);
		custlist.add(c4);
		custlist.add(c1);
		custlist.add(c2);
		System.out.println(custlist.size());
		for(Customer c:custlist){
			System.out.println(c);
		}
	}

}
