package dey27_menuManager;

/**
 * Class Salad
 * @author Devin Young
 *created 10/6/2022
 */
public class Salad {

	private String name;
	private String description;
	private int calories;

	Salad(String saladName, String saladDescription, int saladCalories)
	{
		name =	saladName; 
		description = saladDescription;
		calories = saladCalories;

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

