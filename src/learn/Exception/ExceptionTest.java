package learn.Exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			int[] a=new int[5];
			System.out.println("hello1");
			String str=null;
			System.out.println(str.length());
			System.out.println("hello5");
			a[7]=89;
			System.out.println("hello2");
		}
		
		catch( NullPointerException ae){System.out.println("I catched Exception in ArrayIndexOutofBaounds"+ae.getMessage());}
		
		catch(ArrayIndexOutOfBoundsException ae){System.out.println("I catched Exception in ArrayIndexOutofBaounds"+ae.getMessage());}
		catch(Exception ex){System.out.println("I catched Exception"+ex.getMessage());}	
		finally{
			System.out.println("finally block");
		}
		System.out.println("hello3");
		}
	
}


