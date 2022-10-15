package dey27_menuManager;

/**
 * Class Menu
 * @author Devin Young
 *created 10/6/2022
 */
public class Menu {

	private String name;
	private Entree entree ;
	private Side side;
	private Salad salad;
	private Dessert dessert;


	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
public Menu(String name) {
	
}
	
public Menu(String name, Entree entree, Salad salad) {
	this.setName(name);
	this.entree = entree;
	this.salad = salad;
	this.side = null;
	this.dessert = null;
}

public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
	this.setName(name);
	this.entree = entree;
	this.side = side;
	this.salad = salad;
	this.dessert = dessert;
}

	public  int totalCalories()
	{
		int totalCalories = 0;
		if (entree == null) {
		}
		else {
			totalCalories = totalCalories + entree.getCalories();
		}
		if (side == null) {
		}
		else {
			totalCalories = totalCalories + side.getCalories();
		}
		if (salad == null) {
		}
		else {
			totalCalories = totalCalories + salad.getCalories();
		}
		if (dessert == null) {
		}
		else {
			totalCalories = totalCalories + dessert.getCalories();
		}
		return totalCalories;
	}

	public String description()
	{
		String  allDescriptions = null;
		if (entree == null){
			System.out.println("entree is N/A");
		}
		else {
			allDescriptions = allDescriptions + entree.getDescription() + "\n";
		}
		if (side == null){
			System.out.println("side is N/A");
		}
		else {
			allDescriptions = allDescriptions + side.getDescription() + "\n";
		}
		if (salad == null){
			System.out.println("salad is N/A");
		}
		else {
			allDescriptions = allDescriptions + salad.getDescription() + "\n";
		}
		if (dessert == null){
			System.out.println("dessert is N/A");
		}
		else {
			allDescriptions = allDescriptions + dessert.getDescription() + "\n";
		}



		return allDescriptions;
	}
	
}
