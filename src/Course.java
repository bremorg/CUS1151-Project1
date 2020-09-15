/**
 * Outline for an academic course.
 * 
 * @author Ice Lin
 *
 */

abstract public class Course
{
    // assume course has following basic informations
    private String title;
    private String number;
    private String description;
    private String department;

    //----------------------------------------------------------------
    //  Sets up a course with the specified information (write constructor)
    //----------------------------------------------------------------
    public Course(String title, String number, String description,
            String department)
    {
        this.title = title;
        this.number = number;
        this.description = description;
        this.department = department;
    }
    //-----------------------------------------------------------------
    //  Returns a string including the basic course information.
    //-----------------------------------------------------------------
    public String toString()
    {
    	return "Title: " + this.title + "\n" + "Number: " + this.number + "\n" + "Description: " + this.description + "\n" + "Department: " + this.department + "\n" + "~" + "\n";
    }
}