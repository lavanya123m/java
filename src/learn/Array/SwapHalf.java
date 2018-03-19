package learn.Array;

import java.util.Scanner;

public class SwapHalf {

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
	public static void swap(int ...args){
		int n=0;
		try{
		int i=0;		

		while(true){
			int temp=0;
			temp=args[i];
			args[i]=args[i+1];
			args[i+1]=temp;
			System.out.print(" " + args[i]);

			System.out.print(" " + args[i+1]);
			i=i+2;
			n=args.length;
			
		}
		
			
		
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.print("`");
			
		}if(n%2!=0){
			System.out.print(n=args[args.length-1]);
		}
	}
	
	public static void main(String args[]){
		int i[]=scanner();
			swap(i);
	}

}
