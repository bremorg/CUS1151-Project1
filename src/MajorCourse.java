

public class MajorCourse extends Course
{
    private String major;
    private String requisite;

    //----------------------------------------------------------------
    //  Sets up a major course with the specified information (imp cosntructor )
    //----------------------------------------------------------------
    public MajorCourse(String title, String number, 
            String description, String department, 
            String major, String requisite)
    {
    	 super(title,number,description,department);// to do
    	 this.major = major;
    	 this.requisite = requisite;
        // to do: Hint, note this class is subclass of Course class
    }

    //----------------------------------------------------------------
    //  Returns information about this course as a string.
    //----------------------------------------------------------------
    public String toString()
    {
    	return null;
       // to do
    }
}