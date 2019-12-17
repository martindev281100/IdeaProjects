
package fpt.edu.gch0712;

/**
 *
 * @author mac
 */
public class ParttimeEmployee extends Employee {
    private final static double partTimeRate = 0.5;
    
    public ParttimeEmployee() {
        super();
    }
    
    public ParttimeEmployee(String name, int age, double rate) {
        super(name, age, rate);
    }
    
    @Override
    public double getSalary() {
        return super.getSalary() * partTimeRate;
    }
}
