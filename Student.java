import java.util.ArrayList;

public class Student {

  private String name;

  private int grade;

  private ArrayList<String> courses;

  public Student(String name, int grade, ArrayList<String> courses) {
    this.name = name;
    this.grade = grade;
    this.courses = courses;
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<String> getCourses() {
    return this.courses;
  }

  public void addCourse(String course) {
    this.courses.add(course);
  }

  public void removeCourse(String course) {
    this.courses.remove(course);
  }
  

  public static void main(String[] args) {
    Student student = new Student("Varya Hinkel", 11, new ArrayList<String>());
    student.addCourse("Biology");
    System.out.println(student.getName() + " is taking classes " + student.getCourses());
    student.addCourse("math");
    student.removeCourse("Biology");
    System.out.println(student.getName() + " is taking classes " + student.getCourses());
  }
}