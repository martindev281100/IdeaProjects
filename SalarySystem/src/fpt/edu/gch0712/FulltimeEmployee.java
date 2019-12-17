
package fpt.edu.gch0712;

/**
 * Represents full-time employee in the system.
 * @author mac
 */
public class FulltimeEmployee extends Employee {
    private int bonus;
    /**
     * Default constructor. Initiates a full-time employee by default values.
     */
    public FulltimeEmployee() {
        // call constructor from base class for default values.
        super();
    }
    
    public FulltimeEmployee(String name, int age, double rate, int bonus) {
        // call constructor from base class to setup name, age and rate
        super(name, age, rate);
        
        // validate bonus, must > 0
        this.bonus = bonus;
    }
    
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
    
    @Override
    public String toString() {
        String s = super.toString();
        s       += "Bonus = " + bonus + "\n";
        
        return s;
    }
}
