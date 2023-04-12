import java.util.*;
public class CourseRepo {

    ArrayList<Course> Courses = new ArrayList<Course>();

    public Course Addcource(Course c){
        Courses.add(c);
        return c;
    }
  
    CourseRepo(){}

    CourseRepo(Course c1,Course c2, Course c3, Course c4, Course c5){
        Addcource(c1); 
        Addcource(c2); 
        Addcource(c3);
        Addcource(c4);
        Addcource(c5);
    }

    @Override
    public String toString(){
        String display = "";
        for (Course course : Courses) {
            display += course;
        }
        return display;
    }
    
}
