import java.util.ArrayList;
public class FoodDriver {

	public static void main(String[] args) {
		ArrayList<Food> foodList = new ArrayList<Food>();
		Meat sirlon  = new Meat(10, "Sirlon Steak", 201);
		Vegetable carrot = new Vegetable(1, "Carnical Carrot", true, 10);
		Eggs eggExpress = new Eggs("Happy Hills Farm","brown egg", "regular", 12);
		foodList.add(sirlon);
		foodList.add(carrot);
		foodList.add(eggExpress);
		for (int i = 0; i < foodList.size(); i++) {
			System.out.println(foodList.get(i).calories());
			System.out.println(foodList.get(i).organic());
			if(foodList.get(i) instanceof Dairy) {
				System.out.println(((Dairy)foodList.get(i)));
			}
			if(foodList.get(i) instanceof Meat) {
				System.out.println(((Meat)foodList.get(i)).getCaloriesPerOunce());
				System.out.println(((Meat)foodList.get(i)).getName());
			}
			if(foodList.get(i) instanceof Vegetable) {
				System.out.println(((Vegetable)foodList.get(i)).getPieces());
			}
		}
		

	}

}
