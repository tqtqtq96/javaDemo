package jsu.ljt.javademo.model.ch06;

public class Employee {
  private static int idCounter = 0; // 静态成员，用于生成唯一员工ID
  private int id;
  private String name;
  private double salary;
  private String department;

  public Employee(String name, double salary, String department) {
    this.id = ++idCounter;
    this.name = name;
    this.salary = salary;
    this.department = department;
  }

  // Getter and Setter methods
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public String getDepartment() {
    return department;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", salary=" + salary +
        ", department='" + department + '\'' +
        '}';
  }
}

