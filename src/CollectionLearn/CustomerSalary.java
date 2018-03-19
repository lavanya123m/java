package CollectionLearn;

import java.util.Comparator;

public class CustomerSalary implements Comparator<Customer> {


	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
				if(o1==null || o2==null )
					
					if(o1.getSalary()>o2.getSalary()){
						return 1;
					}else if(o1.getSalary()<o2.getSalary()){
						return -1;
					}return 0;
	}
	
}
