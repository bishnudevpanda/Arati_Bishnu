class Student{
    public int id;
    public String name;							//defining variables
    public double percentage;
    public String[] skills; 

    public Student(int id, String name, double percentage,String[] skills) {	
        this.id=id;
        this.name = name;						//constructor class
        this.percentage = percentage;
	this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
									//getter methods
    public double getPercent() {
        return percentage;
    }

    public String[] getSkills()
    {
	return skills;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
										//setter methods
    public void setPercent(double percentage) {
        this.percentage = percentage;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}
	
