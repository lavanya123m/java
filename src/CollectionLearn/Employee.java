package CollectionLearn;

public class Employee {

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + empid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + "]";
	}
	
	public Employee(int empid, String name, Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id) {
		// TODO Auto-generated constructor stub
	}
	public int empid;
/*
	@Override
	/*public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (empid != other.empid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	public String name;
	public Address address;
	
}
