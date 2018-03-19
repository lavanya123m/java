package CollectionLearn;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> custlist=new ArrayList<Customer>();

		Customer c1=new Customer(1001,"jhon",1233);
		Customer c2=new Customer(1002,"joh",1211);
		Customer c3=new Customer(1003,"john",1200);

		
		Customer c4=new Customer(1002,"joh",1211);
		custlist.add(c1);
		custlist.add(c2);
		custlist.add(c3);
		custlist.remove(c2);
		
		System.out.println(custlist.get(0).getCustId());
		System.out.println(custlist.size());
		System.out.println(custlist.get(1).getCustId());
		
		System.out.println("old approch");
		System.out.println(custlist.contains(c3));
		System.out.println(custlist.contains(c4));
		for(int i=0;i<custlist.size();i++){

			System.out.println(custlist.get(i).getCustId());
			System.out.println(custlist.get(i).getName());
			System.out.println(custlist.get(i).getSalary());
		
		}
		System.out.println("new approch");
		
		for(Customer c:custlist){

			System.out.println(c.getCustId());
			System.out.println(c.getCustId());
			System.out.println(c.getCustId());
		
			System.out.println(c1);
		}

	}

}
