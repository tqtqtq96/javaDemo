package jsu.ljt.javademo.model.ch06;

import java.util.ArrayList;
import java.util.List;

public class Department {
  private String name;
  private List<Employee> employees; // 对象数组，用于存储员工

  public Department(String name) {
    this.name = name;
    this.employees = new ArrayList<>();
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public double getTotalSalary() {
    double totalSalary = 0;
    for (Employee employee : employees) {
      totalSalary += employee.getSalary();
    }
    return totalSalary;
  }

  @Override
  public String toString() {
    return "Department{" +
        "name='" + name + '\'' +
        ", employees=" + employees +
        '}';
  }
}

