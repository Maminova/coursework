package ru.skypro.course1.coursework;

public class Employee {
    private String name;
    private String surname;
    private String lastname;
    private String department;
    private double salary;
    private static int id = 0;


    public Employee(String name, String surname, String lastname, String department, double salary) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.department = department;
        this.salary = salary;
        id++;
    }




    public String getName() {
        return name;
    }

    public String getSurnameName() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
