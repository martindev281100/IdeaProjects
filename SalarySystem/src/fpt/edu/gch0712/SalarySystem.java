
package fpt.edu.gch0712;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SalarySystem extends MenuSystem {
    private final static int FULL_TIME = 1;
    private final static int PART_TIME = 2;
    private final static int HOURLY = 3;
    private final static int SALARY = 4;
    
    private String name;
    private int age;
    private double rate;
    
    private void enterBasicInfo() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter full-time employee name: ");
        name = sc.nextLine();
        
        age = getInt("Enter full-time employee age: ");
        
        rate = getDouble("Enter full-time employee rate: ");
    }
    
    private int getInt(String prompt) {
        boolean invalid = true;
        int a = 0;
        
        while (invalid) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(prompt);
                a = sc.nextInt();
                invalid = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input (not an integer)! Try again!");
            }
        }
        return a;
    }
    
    private double getDouble(String prompt) {
        boolean invalid = true;
        double a = 0;
        
        while (invalid) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(prompt);
                a = sc.nextDouble();
                invalid = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input (not a double)! Try again!");
            }
        }
        return a;
    }
    
    private ArrayList<Employee> employees = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalarySystem program = new SalarySystem();
        program.run();
    }

    @Override
    protected void printMenu() {
        System.out.println("Salary system");
        System.out.println("1. Add full-time employee");
        System.out.println("2. Add part-time employee");
        System.out.println("3. Add hourly employee");
        System.out.println("4. Calculate salary");
        System.out.println("0. Exit");
    }

    @Override
    protected void doTask(int choice) {
        switch (choice) {
            case FULL_TIME:
                doTaskFulltime(); break;
            case PART_TIME:
                doTaskParttime(); break;
            case HOURLY:
                doTaskHourly(); break;
            case SALARY:
                doTaskSalary(); break;
            case EXIT:
                break;
            default:
                doInvalidOption();
        }
    }

    private void doTaskFulltime() {
        enterBasicInfo();
        
        Scanner sc = new Scanner(System.in);      
        
        System.out.print("Enter full-time bonus: ");
        int bonus = sc.nextInt();
        
        try {
            FulltimeEmployee emp = new FulltimeEmployee(name, age, rate, bonus);

            employees.add(emp);
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        
    }

    private void doTaskParttime() {
        enterBasicInfo();
        
        ParttimeEmployee emp = new ParttimeEmployee(name, age, rate);
        
        employees.add(emp);
    }

    private void doTaskHourly() {
        enterBasicInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours in month: ");
        int hours = sc.nextInt();
        
        HourlyEmployee emp = new HourlyEmployee(name, age, rate, hours);
        
        employees.add(emp);
    }

    private void doInvalidOption() {
        System.out.println("Invalid option. Please try again!");
    }

    private void doTaskSalary() {
//        for (int i = 0; i < employees.size(); i++) {
//            // get employee at i position
//            Employee e = employees.get(i);
//            // print employee information and salary
//            System.out.print(e);
//            System.out.println("Salary: " + e.getSalary());
//        }
        
        for (Employee e : employees) {
            // print employee information and salary
            System.out.print(e);
            System.out.println("Salary: " + e.getSalary());
        }
    }
    
}
