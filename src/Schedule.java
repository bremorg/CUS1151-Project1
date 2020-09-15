

public class Schedule
{
    private Course[] courseList;

    //-----------------------------------------------------------------
    //  Sets up the list of courses. Assume each student takes five courses: two major courses, two general education  courses, and one Elective course
    // you need to ask student to enter his/her course information, based on above option.
    //-----------------------------------------------------------------
    public Schedule()
    {
        courseList = new Course[5];
        // to do: assign course that student entry in course categories. Hint, you need to call the constructor of relevant course
        
    }

    //-----------------------------------------------------------------
    //  Prints out a detailed schedule of all classes.
    //-----------------------------------------------------------------
    public void display()
    {
        for(Course course : courseList) 
        {
        	System.out.println(course.toString());
        	//change later as needed
        }
    }
}