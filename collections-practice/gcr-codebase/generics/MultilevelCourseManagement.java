
import java.util.ArrayList;

abstract class CourseType<T>{
    String courseName;
    CourseType(String name){
        this.courseName=name;
    }
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - " + courseName;
    }
}
class ExamCourse extends CourseType{
    public ExamCourse(String courseName) {
        super(courseName);
    }
}
class AssignmentCourse extends CourseType{
    public AssignmentCourse(String courseName) {
        super(courseName);
    }
}
class ResearchCourse extends CourseType{
    public ResearchCourse(String courseName) {
        super(courseName);
    }
}
class Course<T extends CourseType>{
    private ArrayList<T>courses=new ArrayList<>();
    public void addCourse(T course) {
        courses.add(course);
    }
    public ArrayList<T> getCourses() {
        return courses;
    }
}
class CourseUtil {
    public static void displayCourses(ArrayList<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}

public class MultilevelCourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses =new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics"));
        examCourses.addCourse(new ExamCourse("Physics"));
        Course<AssignmentCourse> assignmentCourses =new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("History"));
        assignmentCourses.addCourse(new AssignmentCourse("Political Science"));
        Course<ResearchCourse> researchCourses=new Course<>();
        researchCourses.addCourse(new ResearchCourse("Quantum Computing"));
        researchCourses.addCourse(new ResearchCourse("Artificial Intelligence"));
        System.out.println("Exam-Based Courses:");
        CourseUtil.displayCourses(examCourses.getCourses());

        System.out.println("\nAssignment-Based Courses:");
        CourseUtil.displayCourses(assignmentCourses.getCourses());

        System.out.println("\nResearch-Based Courses:");
        CourseUtil.displayCourses(researchCourses.getCourses());
    }
}