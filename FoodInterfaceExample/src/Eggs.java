
public class Eggs extends Dairy implements Food {
	private String size;
	private int count;
	
	
	
	public Eggs() {
		super();
		this.size = "large";
		this.count = 12;
	}
	@Override
	public float calories() {
		float caloriesEgg;
		if(size.equals("regular")) {  //do not use size == "regular"
			caloriesEgg = count *18;
		}
		else if (size.equals("large")) {
			caloriesEgg = count * 28;
		}
		else {
			caloriesEgg = count * 38;
		}
		return caloriesEgg;
	}
	public Eggs(String companyName, String name, String size, int count) {
		super(companyName, name);
		this.size = size;
		this.count = count;
	}
	@Override
	public boolean organic() {
		return false;
	}
	@Override
	public String toString() {
		return "Eggs [size=" + size + ", count=" + count + ", companyName=" + companyName + ", name=" + name + "]";
	}
	
	
	
	

}
