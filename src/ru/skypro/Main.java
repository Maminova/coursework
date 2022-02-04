package ru.skypro;

import ru.skypro.course1.coursework.Employee;

import java.util.Arrays;


public class Main {

    public static void printEmployee(Employee[] employees) {
        Employee[] arr = new Employee[10];
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            employees[i].getSalary();
            sum += employees[i].getSalary();


        }
        System.out.println("Сумма трат за месяц составила = " + sum + "руб");
    }

    public static void main(String[] args) {
        // write your code here
        Employee[] arr = new Employee[10];
        for (int i = 0; i < arr.length; i++) {
//        arr [0] = new Employee() ;
//        arr [1] = new Employee();
//        }
//        Employee person1 = new Employee("Артур", "Беликов", "Игнатович", "1", 100000);
//        String s = person1.toString();
//        System.out.println(person1);
//        Employee person2 = new Employee("Андрей", "Борисов", "Иванович", "2", 110000);
//        String c = person2.toString();
//        System.out.println(person2);
//        Employee person3 = new Employee("Андрей", "Борисов", "Иванович", "2", 120000);
//        String f = person3.toString();
//        System.out.println(person3);


//        public static void printEmployee() {
                Employee[] employees = new Employee[10];
                int sum = 0;
                employees[0] = new Employee("o", "o", "o", "o", 100000);
                employees[1] = new Employee("1", "1", "1", "1", 110000);
                employees[2] = new Employee("2", "2", "2", "2", 120000);



                }

                System.out.println("Сумма трат за месяц составила = " + sum + "руб");
            }


//        private static double getMaxSalary(Employee[]maxSalary) {
//            double maxSalary = 0;
//            for (int i = 0; i < employees.length; i++) {


            }
        }



