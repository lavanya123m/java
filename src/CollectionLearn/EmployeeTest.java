package CollectionLearn;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {
	
	public static int id;
	public static int mgrId;
	public static String name;
	public static String line1;
	public static String line2;
	public static String city;
	public static String state;
	public static int zipcode;

	public static void main(String args[]){
		
		List<Employee> e=new ArrayList<Employee>();
		
		List<Manager> m1=new ArrayList<Manager>();
		
		Address a1=new Address("ellsworth","317","Fairfield","ct",06605);
		Employee e1=new Employee(1001,"lavya",a1);
		
		Address a2=new Address("ellsworth","317","Fairfield","ct",06605);
		Employee e2=new Employee(1002,"deepa",a2);
		
		Address a3=new Address("ellsworth","317","bridgeport","ct",06605);
		Employee e3=new Employee(1003,"keerthi",a3);
		
		Address a4=new Address("ellsworth","317","norwalk","ct",06605);
		Employee e4=new Employee(1004,"bhavya",a4);
		
		Address a5=new Address("ellsworth","317","brideport","ct",06605);
		Employee e5=new Employee(id,name,a5);
		
		Address a6=new Address("ellsworth","317","brideport","ct",06605);
		Manager m=new Manager(100,1002,"lavanya",a6);
		e.add(e3);
		e.add(e4);
		e.add(e1);
		e.add(e2);
		
		
		m1.add(m);
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to your Employee Management System");
	        System.out.println();
	        boolean x=false;
		     
	        do{
	        System.out.println("Please enter your choice below from the following options");
	        System.out.println();
	        System.out.println("1. Add Employees");
	        System.out.println("2. Delete an employee ");
	        System.out.println("3. Search for employee Details");
	        System.out.println("4. Add Manager ");
	        System.out.println("5. Assiging employee to manager");
	        System.out.println("6. Remove employee from Manager List");
	        System.out.println("7. Sort employee Based on salary ");
	        System.out.println("8. Sort Employee Based on Name");
	        System.out.println("9. No of employees for particular city");
	        System.out.println("10. to exit");
	        int choice=sc.nextInt();
	        
	        switch(choice){
	        	case 1:
	        	   System.out.println("Enter the id");
		           id = sc.nextInt();
		           e5.setEmpid(id);
		           System.out.println("Enter name");
	                name = sc.next();
	               e5.setName(name);
	               System.out.println("Adress Line1");
	               line1 = sc.next();
	               a5.setLine1(line1);
	               System.out.println("Line2:");
	                line2 = sc.next();
	               a5.setLine2(line2);
	               System.out.println("city:");
	                city = sc.next();
	               a5.setCity(city);
	               System.out.println("State");
	                state = sc.next();
	               a5.setState(state);
	               System.out.println("Zipcode");
	               zipcode = sc.nextInt();
	               a5.setZipcode(zipcode);
	               e.add(e5); 
	               System.out.println(e1.getEmpid()+""+e1.getAddress());

	        		for (int i=0;i < e.size();i++)
	        		{
	        		  System.out.println("Value of element "+i+"" +e.get(i));
	        		}
	        		break;
	        	case 2:
	        		System.out.println("enter employye id to be removed");
	        		
	        		Integer i=sc.nextInt();
	        		for(int j=0;j<e.size();j++){
	        			if(e.get(j).getEmpid()==i){
	        				e.remove(j);
	        				}
	        		}
	        		for(int j=0;j<e.size();j++){
	        			System.out.println(e.get(j));
	        		}
	        		break;
	        	case 3:
	        		System.out.print("enter value to be searched");
	        		 i=sc.nextInt();
	        		for(int j=0;j<e.size();j++){
	        				if(e.get(j).getEmpid()==i){
	        					
	        				System.out.println("value found"+e.get(j));
	        				
	        				}
	        			}
	        	    
	        		break;
	        		case 4:
	        		System.out.println("enter manager details");
	        		System.out.println("Enter the manager id");
			           mgrId = sc.nextInt();
	        		System.out.println("Enter the employee id");
			           id = sc.nextInt();
			           m.setEmpid(id);
			           System.out.println("Enter name");
		                name = sc.next();
		               m.setName(name);
		               System.out.println("Adress Line1");
		               line1 = sc.next();
		               a6.setLine1(line1);
		               System.out.println("Line2:");
		                line2 = sc.next();
		               a6.setLine2(line2);
		               System.out.println("city:");
		                city = sc.next();
		               a6.setCity(city);
		               System.out.println("State");
		                state = sc.next();
		               a6.setState(state);
		               System.out.println("Zipcode");
		               zipcode = sc.nextInt();
		               a6.setZipcode(zipcode);
		               m1.add(m); 
		               //System.out.println(m.getEmpid()+""+m.getAddress());

		        		for (int k=0;k < m1.size();k++)
		        		{
		        		  System.out.println("Value of element" +m1.get(k));
		        		}
		        		break;

	        		case 5:
	        	    System.out.println("enter employeeid to assign to manager");
	        	  
	        		 i=sc.nextInt();
	        		for(int j=0;j<e.size();j++){
	        				if(e.get(j).getEmpid()==i){
	        					System.out.println("employee found");
	        				Manager mgr= new Manager(e.get(j).getEmpid(),e.get(j).getEmpid(),e.get(j).getName(),e.get(j).getAddress());
	        				m1.add(mgr);
	        				}
	        			}
	        		
	        		for(Manager emp:m1){
	        			System.out.println(emp);
	        		}break;
	        		case 6:
	        		System.out.println("enter the mgr id to remove");
	        		i=sc.nextInt();
	        		try{
	        		for(int j=0;j<m1.size();j++){
        				if(m1.get(j).getMgrId()==i){
        					System.out.println("employee found");
        					m1.remove(j);
        				}
	        		}}catch(Exception ex){System.out.println("Exception caught");}
	        		for(Manager emp:m1){
	        			System.out.println(emp);
	        		}
	        		break;
	        		case 7:
	        		System.out.println("unsorted list of Id's");
	        		for(Employee emp:e){
	        			System.out.println(emp);
	        		}
	        		Collections.sort(e,new EmpIdComparator());

	        		System.out.println("sorted list of Id's");
	        		for(Employee emp:e){
	        			System.out.println(emp);
	        		}break;
	        	case 8:
	        		System.out.println("unsorted list of names's");
	        		for(Employee emp:e){
	        			System.out.println(emp);
	        		}
	        		Collections.sort(e,new EmpNameComparator());

	        		System.out.println("sorted list of names's");
	        		for(Employee emp:e){
	        			System.out.println(emp);
	        		}
	        		break;
	        	case 9:
	        		for(int j=0;j<e.size();j++){
	        			System.out.println(e.get(j));
	        		}
	        		System.out.println("enter city name");
	        		
	        		int count=0;
	        		String city=sc.next();
	        		System.out.print("number of employee in " +city+": " );
	        		for(int j=0;j<e.size();j++){
	        		
	        			if(e.get(j).getAddress().getCity().equals(city)){
	        				count++;
	        				}
	        		}
	        		System.out.println(count);
	        			break;
	        		
	        	case 10:
	        		 x=true;
	        		 System.out.println("Thank you!!!");
	        		 break;
	        	default: 
	        		System.out.println("enter values from 1 to 10");
	        		break;
	        } 
	        
	     }while(x==false);
		}
	
}      