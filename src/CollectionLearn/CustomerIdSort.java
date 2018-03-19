package CollectionLearn;

import java.util.Comparator;

public class CustomerIdSort implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		
		if(o1==null || o2==null ){}
		
		if(o1.getCustId()>o2.getCustId()){
			return 1;
		}else if(o1.getCustId()<o2.getCustId()){
			return -1;
		}return 0;
	}

	
}
