package CollectionLearn;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Employee>{

	

	@Override
	public int compare(Employee o1, Employee o2) {

		if(o1==null || o2==null ){}
		
		if(o1.getEmpid()>o2.getEmpid()){
			return 1;
		}else if(o1.getEmpid()<o2.getEmpid()){
			return -1;
		}return 0;
	
	}

}
