package dey27_menuManager;
/**
 * Class MenuTest
 * @author Devin Young
 *created 10/5/2022
 */
public class MenuTest {
	public static void main(String[] args) {

		Entree myEntree = new Entree("Steak", " a portion of meat", 300);

		Entree myEntree2 = new Entree("Spaghetti", "mixture of noodles, tomato sauce, mushrooms and meat", 250);

		Side mySide = new Side ("Fries", "fried potatoes", 450);

		Salad mySalad = new Salad("Salad", "a mixture of lettuce and other vegetables", 250);

		Salad mySalad2 = new Salad ("Ceaser Salad","romainian lettuce, croutons, and many more healthy ingredients" ,175);


		Dessert myDessert = new Dessert("Cheesecake", "a type of cake made with cream and soft cheese on a pastry crust",500 );

		Menu menuHalf = new Menu("only partial courses", myEntree, mySalad);
		String halfDescription = menuHalf.description();
		System.out.println(halfDescription);
		int halfCalories = menuHalf.totalCalories();
		System.out.println(halfCalories);
		Menu menuWhole = new Menu("Four course meal", myEntree2, mySide, mySalad2, myDessert);
		String WholeDescription = menuWhole.description();
		System.out.println(WholeDescription);
		int wholeCalories = menuWhole.totalCalories();
		System.out.println(wholeCalories);
	}
}
