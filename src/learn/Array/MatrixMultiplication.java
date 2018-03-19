package learn.Array;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two dimensions of matrix");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a[][] =new int[x][y];
		System.out.println("enter values:");
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
			a[i][j]=sc.nextInt();
			
			}
		}
		
		
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
			System.out.print(" "+a[i][j]);
			
			}System.out.println();
		}
		
	}

}
