
package fpt.edu.gch0712;

/**
 * Base class for all kind of employees (FulltimeEmployee, ParttimeEmployee, HourlyEmployee).
 * @author tungdt27
 */
public class Employee {
    protected String name;
    protected int age;
    protected double rate;
    public final static int BASIC_SALARY = 1800;
    /**
     * Default constructor. Initiates employee's info by default values.
     */
    public Employee() {
        name = "John Doe";
        age = 1;
        rate = 1.0;
    }
    /**
     * Initiates employee's info by parameters.
     * @param name name of employee
     * @param age age of employee
     * @param rate salary rate to calculate salary
     */
    public Employee(String name, int age, double rate) {
        // validate data
        if (name.length() == 0) throw new RuntimeException("Empty name!");
        if (age < 18) throw new RuntimeException("Invalid age! Must greater than or equal 18");
        if (rate <= 0) throw new RuntimeException("Invalid rate! Must greater than 0");
        
        // data is validated
        this.name = name;
        this.age = age;
        this.rate = rate;
    }
    
    public double getSalary() {
        return rate * BASIC_SALARY;
    }
    
    @Override
    public String toString() {
        String s = "Name = " + name + "\n";
        s       += "Age = " + age + "\n";
        s       += "Rate = " + rate + "\n";
        
        return s;
    }
}
