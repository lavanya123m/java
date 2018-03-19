package learn.Array;

public class Testarray {
	public static void main(String args[]){
		
		int[] i={10,20,30,40,50,60};
		int n=(i.length)/2;
		int[] k=new int[10];
		int[] h=new int[10];
		for(int j=n;j<i.length;j++){
			h[j]=i[j];
			System.out.println(h[j]);
		}
		for(int j=0;j<n;j++){
			k[j]=i[j];
			System.out.println(k[j]);
		}
		
	}
}
