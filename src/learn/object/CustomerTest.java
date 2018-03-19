package learn.object;

public class CustomerTest {
	public static void main(String args[]){
	
		Customer c=new Customer();
		c.setCustId(100);
		c.setCustName("lava");
		c.setPhoneNumber(45646);
		
		Customer c2=new Customer();
		c2.setCustId(100);
		c2.setCustName("lava");
		c2.setPhoneNumber(45646);
		
		System.out.print(c2.hashCode());
		
		System.out.println(c2.equals(c));
		
		String a="hello";
		String b="hello";
		
		System.out.println("equality od string :"+b.equals(a));
		System.out.println(a);
		System.out.println(c);
		System.out.println(c2);
		
		
	}

}
