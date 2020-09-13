

public class GeneralEducation extends Course
{
    private String requirement;

    //----------------------------------------------------------------
    //  Sets up a general education course with the specified information.
    //----------------------------------------------------------------
    public GeneralEducation(String title, String number, String description, String department, String requirement)
    {
    	 super(title,number,description,department);// to do
        // to do: hint, this is subclass of course class.
    }

    //----------------------------------------------------------------
    //  Returns information about this course as a string.
    //----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();
        result += "\nGeneral Education Requirement Filled: " + 
                requirement;
        return result;
    }
}