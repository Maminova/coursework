package ru.skypro;

import ru.skypro.course1.coursework.Employee;

import java.util.Arrays;


public class Main {
    private static Employee[] employees = new Employee[10];

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void printEmployeesNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public static void printEmployeesSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            employees[i].getSalary();
            sum += employees[i].getSalary();
        }
        System.out.println("Сумма трат за месяц составила = " + sum + "руб");
    }

    public static Employee findEmployeeMaxSalary() {
        Employee employee = employees[0];
        double max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (max < employees[i].getSalary()) {
                max = employees[i].getSalary();
                employee = employees[i];
            }
        }
        return employee;
    }

    public static void printEmployeesAverageSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            employees[i].getSalary();
            sum += employees[i].getSalary();
        }
        sum /= employees.length;
        System.out.println("Средняя " + sum + "руб");
    }

    public static Employee findEmployeeMinSalary() {
        Employee employee1 = employees[0];
        double min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (min > employees[i].getSalary()) {
                min = employees[i].getSalary();
                employee1 = employees[i];
            }
        }
        return employee1;
    }

    public static void main(String[] args) {
        employees [0]= new Employee("Петр", 1, 100000);
        employees [1]= new Employee("Иван", 2, 120000);
        employees [2]= new Employee("Федор", 3, 110000);
        employees [3]= new Employee("Екатерина", 4, 90000);
        employees [4]= new Employee("Алина", 5, 115000);
        employees [5]= new Employee("Карина", 6, 125000);
        employees [6]= new Employee("Юля", 7, 130000);
        employees [7]= new Employee("Татьяна", 8, 104000);
        employees [8]= new Employee("Яна", 9, 180000);
        employees [9]= new Employee("Анна", 10, 190000);
        printEmployees();
        printEmployeesSalary();
        findEmployeeMaxSalary();
        findEmployeeMinSalary();
        printEmployeesAverageSalary();
    }

}



