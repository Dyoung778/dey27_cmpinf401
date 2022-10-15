package dey27_menuManager;

/**
 * Class Dessert
 * @author Devin Young
 *created 10/6/2022
 */
public class Dessert {

	private String name;
	private String description;
	private int calories;

	Dessert(String dessertName, String dessertDescription, int dessertCalories)
	{
		name = dessertName;
		description = dessertDescription;
		calories =dessertCalories;

	}
	public String getName()
	{
		return name;
	}
	public String getDescription()
	{
		return description;
	}
	public int getCalories()
	{
		return calories;
	}
	public void setName(String name)
	{
		this.name = name;
	}	
	public void setDescription(String description)
	{
		this.description = description;
	}	
	public void setCalories(int calories)
	{
		this.calories = calories;
	}

}

