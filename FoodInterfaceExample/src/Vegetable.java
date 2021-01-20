
public class Vegetable implements Food{
	private int pieces;
	private String name;
	private boolean isOrganic;
	private float caloriesPerPiece;
	
	public Vegetable(int pieces, String name, boolean isOrganic, float caloriesPerPiece) {
		super();
		this.pieces = pieces;
		this.name = name;
		this.isOrganic = isOrganic;
		this.caloriesPerPiece = caloriesPerPiece;
	}

	public Vegetable() {
		super();
		this.pieces = 1;
		this.name = "Carnival Carrot";
		this.isOrganic = true;
		this.caloriesPerPiece = 10;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOrganic() {
		return isOrganic;
	}

	public void setOrganic(boolean isOrganic) {
		this.isOrganic = isOrganic;
	}

	public float getCaloriesPerPiece() {
		return caloriesPerPiece;
	}

	public void setCaloriesPerPiece(float caloriesPerPiece) {
		this.caloriesPerPiece = caloriesPerPiece;
	}

	@Override
	public float calories() {
		
		return pieces * caloriesPerPiece;
	}

	@Override
	public boolean organic() {
		
		return isOrganic;
	}
	
	
	
	
	
	
}
