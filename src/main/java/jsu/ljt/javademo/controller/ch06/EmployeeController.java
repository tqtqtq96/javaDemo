package jsu.ljt.javademo.controller.ch06;


import jsu.ljt.javademo.pojo.ch06.Department;
import jsu.ljt.javademo.pojo.ch06.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController {
  private Map<String, Department> departments = new HashMap<>();

  @PostMapping("/createDepartment")
  public String createDepartment(@RequestParam String departmentName) {
    if (departments.containsKey(departmentName)) {
      return "部门已存在！";
    }
    departments.put(departmentName, new Department(departmentName));
    return "部门创建成功！";
  }

  @PostMapping("/addEmployee")
  public String addEmployee(@RequestParam String departmentName, @RequestParam String name, @RequestParam double salary) {
    Department department = departments.get(departmentName);
    if (department == null) {
      return "部门未找到！";
    }
    Employee employee = new Employee(name, salary, departmentName);
    department.addEmployee(employee);
    return "员工添加成功！员工ID: " + employee.getId();
  }

  @GetMapping("/employees")
  public Map<String, Department> getDepartments() {
    return departments;
  }
}

