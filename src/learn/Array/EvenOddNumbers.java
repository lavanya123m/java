package learn.Array;

import java.util.Scanner;

public class EvenOddNumbers {

	public static int[] scanner(){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array values");
	
		int p=sc.nextInt();
		
		int[] a=new int[p]; 
		System.out.print("enter the values");
		
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
			
		
	return a;
	}
	public static void evenOdd(int ...args){
		System.out.println("the result is");
		for(int i=0;i<args.length;i++){
			int n=args[i];
			
			if(args[i]%2==0){
				n= n/2;
				System.out.print("  "+n);
			}else{
				n=n*2;
				System.out.print("  "+n);
			}
		}
	}

	public static void main(String args[]){
		int a[]=scanner();
		evenOdd(a);
	}
}
