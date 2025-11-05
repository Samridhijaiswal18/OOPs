abstract class CourseType {}

class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}

class Course<T extends CourseType> {
    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return "Course{name='" + courseName + "', type=" + courseType.getClass().getSimpleName() + "}";
    }
}

class University {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType courseType : courses) {
            System.out.println(courseType.getClass().getSimpleName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Mathematics", new ExamCourse());
        Course<AssignmentCourse> literature = new Course<>("Literature", new AssignmentCourse());
        Course<ResearchCourse> physics = new Course<>("Physics", new ResearchCourse());

        List<Course<? extends CourseType>> courseList = new ArrayList<>();
        courseList.add(math);
        courseList.add(literature);
        courseList.add(physics);

        for (Course<? extends CourseType> c : courseList) {
            System.out.println(c);
        }
    }
}
