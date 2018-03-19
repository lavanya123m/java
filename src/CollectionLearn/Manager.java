package CollectionLearn;

public class Manager extends Employee {

	 public int getMgrId() {
		return mgrId;
	}

	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}

	private int mgrId;

	@Override
	public String toString() {
		return "Manager [mgrId=" + mgrId + " , empid=" + empid + ", name=" + name + ", address=" + address + "]";
	}

	public Manager(int mgrId,int empid, String name, Address address) {
		super(empid, name, address);
		this.mgrId = mgrId;
	}
	
}
