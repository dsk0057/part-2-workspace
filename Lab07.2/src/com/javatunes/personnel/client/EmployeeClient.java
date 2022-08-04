package com.javatunes.personnel.client;

import com.javatunes.personnel.Employee;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class EmployeeClient {

  public static void main(String[] args) {
    Employee employee = new Employee();
    employee.work();
    employee.pay();

    Class<? extends Employee> cls = Employee.class;
    Annotation[] annotations = cls.getAnnotations();
    System.out.println(Arrays.toString(annotations));

    Method[] methods = cls.getDeclaredMethods();
    for(Method method : methods) {
      System.out.println(method.getName());
      Annotation[] methodAnnotations = method.getDeclaredAnnotations();
      System.out.println(Arrays.toString(methodAnnotations));
    }
  }

}
