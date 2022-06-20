package testNG;

public class studentArraylist1 {
    public static int instances = 0;

  
	public class Course {
	    private String courseName;
	    private int noOfStudents;
	    private String teacher;

	    //Getters
	    public String getCourseName(){
	        return this.courseName;
	    }
	    public int getNoOfStudents(){
	        return this.noOfStudents;
	    }
	    public String getTeacher(){
	        return this.teacher;
	    }

	    //Setters
	    public void setCourseName(String courseName){
	        this.courseName = courseName;
	    }
	    public void setNoOfStudents(int noOfStudents){
	        this.noOfStudents = noOfStudents;
	    }
	    public void setTeacher(String teacher){
	        this.teacher = teacher;
	    }

 
	    public Course(){
	        instances++;
	        this.noOfStudents = 0;
	        this.courseName = "Not Set";
	        this.teacher = "Not Set";
	    }

	     
	    public Course(int noOfStudents, String courseName, String teacher){
	        this.noOfStudents = noOfStudents;
	        this.courseName = courseName;
	        this.teacher = teacher;
	    }
	}}