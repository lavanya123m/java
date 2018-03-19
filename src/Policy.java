
public class Policy {

	private int PolicyID;
	public int getPolicyID() {
		return PolicyID;
	}
	public void setPolicyID(int policyID) {
		PolicyID = policyID;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public void setPerimum(int i) {
		this.perimum = i;
	}
	public int getPerimum() {
		return perimum;
	}
	
	private String policyName;
	private int perimum;
}
