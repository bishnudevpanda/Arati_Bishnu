class Student{
    int id;
    String name;
    double percentage;
    ArrayList<String> skills
            = new ArrayList<String>(); 

    public Student(int id, String name, double percentage,String skill) {
        this.id=id;
        this.name = name;
        this.percentage = percentage;
	skills.add(skill);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

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

    public void setPercent(double percentage) {
        this.percentage = percentage;
    }

    public void setSkills(String val) {
        skills.add(val);
    }
}
	