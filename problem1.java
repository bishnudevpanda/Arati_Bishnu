/*Create a class Student which allows for following properties
•	A string type variable “name”
•	A int type variable “id”
•	A double type variable “percentage”
•	A string array “skills”
•	Create multiple constructors to initialize objects based on either one or combination of these properties.
•	All relevant getters and setters must be created
*/

//importing the utility functions
import java.util.*;

class Student
{
    String name;
	int id;
	double percentage;
	String[] skills;
    //here we are making different type of constructors for different type of values.
    public Student(String name, int id)
	{
        this.name=name;                               //For ID
		this.id=id;
    }

	public Student(int id, double percentage)
	{
		this.id=id;                                  //For Percentage
		this.percentage=percentage;                     
	}
	public Student(String name, int id, String[] skills)
	{
		this.name=name;
		this.id=id;
		this.skills=skills;
	}

   //Defining the getters.
    
   public String getName() 
   {
		return this.name;

   }
   public int getId()
   {
		return this.id;

   }
   public double getPercentage()
   {
		return this.percentage;

   }
   public String getSkills()
   {
		return Arrays.toString(this.skills);

   }

    // Defining the setters.

      public void setName(String name)
   {
		this.name=name;

   }
   public void setId(int id)
   {
		this.id=id;

   }
   public void setPercentage(double percentage)
   {
		this.percentage=percentage;

   }
	public void update_skills(String s)
	  {
		  ArrayList<String> myList = new ArrayList<String>(Arrays.asList(myArray));
		  myList.add(s);
		  this.skills = myList.toArray(myArray);
        }
}
