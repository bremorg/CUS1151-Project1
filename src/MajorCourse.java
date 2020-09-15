

public class MajorCourse extends Course
{
    private String major;
    private String requisite;

    //----------------------------------------------------------------
    //  Sets up a major course with the specified information (imp constructor )
    //----------------------------------------------------------------
    public MajorCourse(String title, String number, 
            String description, String department, 
            String major, String requisite)
    {
    	 super(title,number,description,department);
    	 this.major = major;
    	 this.requisite = requisite;
    }

    //----------------------------------------------------------------
    //  Returns information about this course as a string.
    //----------------------------------------------------------------
    public String toString()
    {
    	String result = super.toString();
    	result = result + (String.format("Major: %s\n", this.major)) + (String.format("Requires: %s\n", this.requisite));
    	return result;
    }
    //Getters and setters
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getRequisite() {
		return requisite;
	}

	public void setRequisite(String requisite) {
		this.requisite = requisite;
	}
}