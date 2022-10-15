package dey27_menuManager;

/**
 * Class Side
 * @author Devin Young
 *created 10/6/2022
 */
public class Side {

	private String name;
	private String description;
	private int calories;

	Side(String sideName, String sideDescription, int sideCalories)
	{
		name =	sideName; 
		description = sideDescription;
		calories = sideCalories;

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






