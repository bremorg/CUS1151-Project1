/**
 * A schedule with different types of courses.
 * 
 * @author Ice Lin
 *
 */

import java.util.Scanner;

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
        Course addCourse;
        
        System.out.println("Enter information for each course (two major courses, two general education courses, and one elective).");
        System.out.println();

        for(int i = 1; i < 6; i++) {
        	if (i == 1 || i == 2) {
        		System.out.println("Major Course " + i);
        		addCourse = enterInfo("major");
        	}
        	else if (i == 3 || i == 4) {
        		System.out.println("General Education Course " + (i-2));
        		addCourse = enterInfo("general");
        	}
        	else {
        		System.out.println("Elective Course");
        		addCourse = enterInfo("elective");
        	}
        	courseList[i-1] = addCourse;
        	System.out.println();
        }      
        
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
    
    /**
     * Helper method to obtain info about a course in a student's schedule.
     * 
     * @param type  the kind of course to obtain info for.
     * @return newCourse  course with entered info to add to a schedule.
     *
     */
    public static Course enterInfo(String type) {
    	Course newCourse;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter the title: ");
    	String inputTitle = input.nextLine();
    	
    	System.out.println("Enter the number: ");
    	String inputNumber = input.nextLine();
    	
    	System.out.println("Enter the description: ");
    	String inputDescription = input.nextLine();
    	
    	System.out.println("Enter the department: ");
    	String inputDepartment = input.nextLine();
    	
    	if(type.equals("major")) {
    		System.out.println("Enter the major: ");
        	String inputMajor = input.nextLine();
        	
        	System.out.println("Enter the requisite: ");
        	String inputRequisite = input.nextLine();
        	
        	newCourse = new MajorCourse(inputTitle, inputNumber, inputDescription, inputDepartment, inputMajor, inputRequisite);
    	}
    	else if(type.equals("general")) {
    		System.out.println("Enter the requirement: ");
        	String inputRequirement = input.nextLine();
        	newCourse = new GeneralEducation(inputTitle, inputNumber, inputDescription, inputDepartment, inputRequirement);
    	}
    	else {
    		newCourse = new Elective(inputTitle, inputNumber, inputDescription, inputDepartment);
    	}

    	return newCourse;
 
    }
    
}