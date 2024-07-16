import java.time.LocalDate;

public class Employee {

  private String name;

  private int salary;

  private LocalDate hireDate;

  public Employee(String name, int salary, LocalDate hireDate) {
    this.name = name;
    this.salary = salary;
    this.hireDate = hireDate;
  }

  public int yearsOfService() {
    LocalDate today = LocalDate.now();
    return today.getYear() - this.hireDate.getYear();
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    Employee emp = new Employee("Varya Hinkel", 100000, LocalDate.of(1990, 1, 1));
    System.out.println("The employee " + emp.getName() + " has been with the company for " + emp.yearsOfService() + " years.");
  }
}