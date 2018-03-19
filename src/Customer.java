
public class Customer implements Comparable<Customer>{

	private int custId;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	private String custName;
	private long phoneNumber;
	private Policy policy;
	
	//@Override
	@Override
	public int compareTo(Customer o) {
		if(o==null){
			return 0;
		}
		if(custId > o.custId){
			return 1;
		}else if(custId< o.custId){
			return -1;
		}
		
		//return name.compareTo(other.name);
		return 0;


	}
}
