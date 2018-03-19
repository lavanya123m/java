package learn.object;

public class Customer {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + custId;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (custId != other.custId)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		return true;
	}
	private int custId;
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", phoneNumber=" + phoneNumber + "]";
	}
	private String custName;
	private long phoneNumber;
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
	
	
}
