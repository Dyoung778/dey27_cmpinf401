package dey27_menuManager;

/**
 * Class Entree
 * @author Devin Young
 *created 10/5/2022
 */
public class Entree {

	private String name;
	private String description;
	private int calories;

	Entree(String entreeName, String entreeDescription, int entreeCalories)
	{
		name =	entreeName;
		description = entreeDescription;
		calories = entreeCalories;



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
