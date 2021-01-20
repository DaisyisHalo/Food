
public class Meat implements Food {
	private double ounces;
	private String name;
	private double caloriesPerOunce;
	
	
	public Meat(double ounces, String name, double caloriesPerOunce) {
		super();
		this.ounces = ounces;
		this.name = name;
		this.caloriesPerOunce = caloriesPerOunce;
	}
	
	

	public Meat() {
		super();
		this.ounces = 8;
		this.name = "Ribeye";
		this.caloriesPerOunce = 220 ;
	}
	
	


	public double getOunces() {
		return ounces;
	}



	public void setOunces(double ounces) {
		this.ounces = ounces;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getCaloriesPerOunce() {
		return caloriesPerOunce;
	}



	public void setCaloriesPerOunce(double caloriesPerOunce) {
		this.caloriesPerOunce = caloriesPerOunce;
	}



	@Override
	public float calories() {
		return (float)(ounces * caloriesPerOunce);
	}

	@Override
	public boolean organic() {
		return false;
	}

	
}
