package CollectionLearn;

import java.util.Comparator;

public class EmployeeSearch implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.getEmpid() == o2.getEmpid()){
            return 0;
        } else {
            return -1;
        }
	}

	public void search(int empid){
		
		
	}
}