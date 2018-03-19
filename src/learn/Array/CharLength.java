package learn.Array;

import java.util.Scanner;

public class CharLength {

	public static char[] scanner(){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array values");
	
		int p=sc.nextInt();
		
		char[] a=new char[p]; 
		System.out.print("enter the values");
		
		for(int i=0;i<a.length;i++){
			a[i]=sc.next().charAt(i);
		}
	
	return a;
	}
	public static void charLength(char[] c){
	for(int i=0;i<c.length;i++){
		System.out.println(c[i]);
	}
	}
	public static void main(String args[]){
		char a[]=scanner();
		charLength(a);
	}

}
