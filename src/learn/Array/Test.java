package learn.Array;

public class Test {
	static{
		Number[] obj=new Number[5];
		byte b=10;
		obj[0]=new Byte(b);
		obj[1]=new Long(10L);
		obj[2]=new Integer(10);
		
		for(Object o:obj){
			System.out.println(o);
		}
	}
	
	static{		
	
		String s[]={"abc","bca","cba"};
		Object o[]=s;
		for(Object obj1:o){
			System.out.println(obj1);
		}
	
	}
		static{		
			
			//char s1[]={'a','s','d'};
			int[] j={10,20,30};
			int[] b={40,50,60};
			
			//	int o1[]=s1; error
			int[] o1=j;
			for(Object obj2:o1){
				System.out.println(obj2);
			}
			j=b;
			b=j;
			for(Object obj2:b){
				System.out.println(obj2);
			}
	
		}
		static char array1[]=new char[5];
	public static void main(String args[]){
		System.out.println("output is: " + array1[1]);
		int []i1={1,2,3};
		Example.m1(i1);
		int i2[]=new int[5];
		Example.m1(i2);
		
		Example.m1(new int[3]);
		Example.m1(new int[]{10,20,30});
		
		int i[]=new int[]{1,2,2};
		Example.m1(i);
	
		//object type array
		Object[] obj=new Object[5];
		obj[0]=new Object();
		obj[1]=new String("lavanya");
		obj[2]=new Integer(10);
		obj[3]=new Thread();
		for(Object o:obj){
			System.out.println(o);
		}
		// Number type
		

		Runnable r[]=new Runnable[10];
		r[0]=new Thread();
		for(Object o:r){
			System.out.println(o);
		}
	
		
		
	}
	
}
