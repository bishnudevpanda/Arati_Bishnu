/*Create a class DisplayOperations which inherits from Operations with following methods
•	Display the attributes of the object used to call the method. This method must be called “showAttributes”
•	A method to show the name of student object in upper case called “showNAME”
•	A method “showDifference” to calculate the difference between percentage values of two objects. One object will be calling the method and other will be passed to it.
*/
class displayOperations extends operations{

    //using the display functions to display values
    
    public void showAttributes(){
        System.out.prinltn(this.id);
        System.out.prinltn(this.name);                             //Displaying the base values
        System.out.prinltn(this.percentage);
        System.out.prinltn(this.skills);
    }

    public void showName(){
        System.out.prinltn(this.name.toUpperCase());                 //Printng the name in upper case
    }

    public void showDifference(displayOperations d){
        System.out.prinltn(this.percentage-d.percentage);             //Printing the age difference of 2 objects
    }
    }
}
