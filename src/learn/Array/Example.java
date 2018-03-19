package learn.Array;

public class Example {
	public static int[] k=new int[10];
	
	int a=10,b=20,z=50;
	public static void main(String args[]){
	//protected int a=10; error only final is permitted
	//static int b=10; invalid modifier
	/*int[] i;
	int j[];
	int q[], p[];
	//int []r,[]t;
	//int[9]i;
	int x[][]; //two demensional
	int y[][][];//three dimensional
	int []d[];//==d[][] [][]d
	
	int [][] s,n;*/
	//Example e[]={new Example(),new Example(),new Example()};
	
	//int jk[3]=new int[4];//error
	//	int xz[]=new int['a'];
//		System.out.println(xz[10]);
	int[] a={10,20,30,40,50};
	for(int i=0;i<=k.length;i++){
		System.out.println(a[i]);
		//k[i]=i*i;
		System.out.println(k.length);
	}
	String s="lavanya";
	System.out.println(s.length());
	
	
	
	}
	static void m1(int[] a){
		for(int i=0;i<a.length;i++)
		System.out.print("a:"+a[i]);
	}
}
