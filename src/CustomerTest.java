
public class CustomerTest {
	public static void main(String args[] ){
		Customer c=new Customer();
		c.setCustId(1001);
		c.setCustName("lavanya");
		c.setPhoneNumber(123456);
		Policy p=new Policy();
		p.setPolicyID(10);
		p.setPolicyName("life insurance");
		
		c.setPolicy(p);
		System.out.println(c.getPolicy().getPerimum());
		System.out.println(c.getPolicy().getPolicyName());
		
		c.getPolicy().setPerimum(989);
		System.out.println(c.getPolicy().getPerimum());
		System.out.println(p.getPerimum());
		
	}

}
