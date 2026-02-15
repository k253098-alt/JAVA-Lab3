public class Course {
    int courseCode;
    String courseName;
    int creditHours;

    Course(int courseCode, String courseName, int creditHours){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    void displayCourseDetails(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("-----------------");
    }

    public static void main(String[] args){
        Course c1 = new Course(1001,"OOP",3);
        Course c2 = new Course(1002,"MVC", 3);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
