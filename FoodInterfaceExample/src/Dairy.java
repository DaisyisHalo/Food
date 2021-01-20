
public abstract class Dairy implements Food {
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String companyName;
	protected String name;
	
	public Dairy() {
		super();
		this.companyName = "Good Dairy";
		this.name = "egg";
	}
	
	public Dairy(String companyName, String name) {
		super();
		this.companyName = companyName;
		this.name = name;
	}
	public abstract String toString();
	
	
	
	
}
