//operations class second question
/*Create a class Operations which inherits from the above class. Add following methods to it
•	A method “changeName” to change the name of a given object based on a value passed by the user.
•	Another implementation of “changeName” that takes value from the user to change the name
•	A method add skill which allows caller to add upto 5 skills to the current student object
*/

    class operations extends student {

    public void changeName(String name){
        this.name = name;
    }


    public void changeName(){
        System.out.prinltn("Enter the new value: ");
        String name = sc.next();
        this.name = name;
    }

    public void addSkill(){
        int sk = 6;
        while(sk>5){
            System.out.println("Add on the skills: ");
            sk = sc.nextInt();
        }
        for(int i = 0;i<sk;i++){
            System.out.println("Enter the skill");
            String skill = sc.next();
            this.skills.add(skill);
      }}}
