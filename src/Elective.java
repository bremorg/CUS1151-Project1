

public class Elective extends Course
{
    //----------------------------------------------------------------
    //  Sets up an elective course with the specified information.
    // create a constructor to instantiate elective courses.
    // implement toString method (return the information of elective course)
    //----------------------------------------------------------------
    public Elective(String title, String number, String description, String department) //to do :paramenters
    {
        super(title,number,description,department);
    }

    //-----------------------------------------------------------------
    //  Returns a string including the basic course information.
    //-----------------------------------------------------------------
    public String toString()
    {
    	return super.toString();
    }
}