package learn.Array;

import java.util.Scanner;

public class Sum {

	public static void main(String args[]){
		int i[]=scanner();
			sum(i);
	}
	public static void sum(int ...args){
		//int[] a={10,20,30};
		
		int sum=0;
		for(int i=0;i<args.length;i++){
			sum=sum+args[i];
		}System.out.print(sum);
	
	}
	public static int[] scanner(){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array values");
	
		int p=sc.nextInt();
		
		int[] a=new int[p]; 
		System.out.println("enter the values");
		
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
			
		
	return a;
	}
}
