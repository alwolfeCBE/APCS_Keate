//Sean Coffin
public class PhDStudent extends CollegeStudent {

    //instance variables
    private String thesisTitle; //thesis title
    private boolean isTeaching; //whether or not a PhDStudent is teaching
    private String classTeaching; //the class the PhDStudent is teaching

    //constructor
    public PhDStudent(String name, int age, String gender, String idNum, double gpa, double totalStudyHours, int year, String major,
                      String thesisTitle, boolean isTeaching, String classTeaching)
    {
        // use the super class's constructor
        s/*ToDo*/        //initialize what's new to PhDStudent
        t/*ToDo*/    }

    //getter methods
    public S/*ToDo*/getThesisTitle()
    {
        r/*ToDo*/    }
    public b/*ToDo*/getIsTeaching(){ r/*ToDo*/
    public S/*ToDo*/getClassTeaching()
    {
        r/*ToDo*/    }


    //setter methods
    public v/*ToDo*/setThesisTitle(String thesisTitle)
    {
        t/*ToDo*/    }
    public v/*ToDo*/setIsTeaching(boolean isTeaching)
    {
        t/*ToDo*/    }
    public v/*ToDo*/setClassTeaching(String classTeaching)
    {
        t/*ToDo*/    }

    //Postcondition: totalStudyHours is updated to include the number of hours a PhDStudent spends writing a thesis.
    public v/*ToDo*/writesThesis(int hours)
    {
        s/*ToDo*/
    }

    /* overrides the toString method in the parent class to include a PhDStudent's thesisTitle, whether or not the
       PhDStudent is teaching, and the class the PhDStudent is teaching.
     */
    public /*ToDo*/ toString()
    {
        return (/*ToDo*/ + ", thesis title: " + thesisTitle + ", It is " + isTeaching + " that I am teaching. class teaching: " + classTeaching);
    }

}
