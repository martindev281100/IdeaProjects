/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.edu.gch0712;

/**
 *
 * @author mac
 */
public class HourlyEmployee extends Employee {
    private int hours;
    // TODO: constructors, getSalary, toString
    public HourlyEmployee() {
        super();
        hours = 0;
    }
    
    public HourlyEmployee(String name, int age, double rate, int hours) {
        super(name, age, rate);
        
        // validate hours, must > 0
        this.hours = hours;
    }
    
    @Override
    public double getSalary() {
        final int HOURS_PER_DAY = 8;
        final int DAYS_IN_MONTH = 30;
        final int HOURS_MONTH = HOURS_PER_DAY * DAYS_IN_MONTH;
        
        double salary = hours * super.getSalary() / HOURS_MONTH;
        
        return salary;
    }
    
    @Override
    public String toString() {
        String s = super.toString();
        s += "Hours in month: " + hours;
        return s;
    }
    
}
