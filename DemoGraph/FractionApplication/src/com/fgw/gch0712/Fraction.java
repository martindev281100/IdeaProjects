
package com.fgw.gch0712;

/**
 * A class to represents fraction numbers: 1/2, 3/5, ...
 * @author tungdt27
 */
public class Fraction {
    /**
     * Numerator of a fraction.
     */
    private int numerator;
    /**
     * Denominator of a fraction, should not be zero.
     */
    private int denominator;
    
    /**
     * Default constructor, initiates numerator and demoninator to default values.
     */
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }
    /**
     * Parameterized constructor, initiates numerator and denominator to passed arguments.
     * @param numerator the numerator of this fraction.
     * @param denominator the denominator of this fraction (should not be zero!).
     */
    public Fraction(int numerator, int denominator) throws FractionException {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new FractionException("Error: Denominator cannot be zero!");
        }
        else this.denominator = denominator;
        
    }
    /**
     * Converts this fraction to a string.
     * @return representation of this fraction in string format.
     */
    public String toString() {
        String str = numerator + "/" + denominator;
        return str;
    }
    /**
     * Adds fraction f to this fraction and return the sum.
     * @param f fraction to add to this fraction.
     * @return sum of 2 fractions.
     */
    public Fraction add(Fraction f) throws FractionException {
        int a = this.numerator;
        int b = this.denominator;
        
        int c = f.numerator;
        int d = f.denominator;
        
        //Fraction sum = new Fraction(a*d + b*c, b*d);
        //return sum;
        
        return new Fraction(a*d + b*c, b*d);
    }
    
    /**
     * Subtracts fraction f to this fraction and return the subtraction.
     * @param f fraction to subtract to this fraction.
     * @return subtraction of 2 fractions.
     */
    public Fraction subtract(Fraction f) throws FractionException {
        int a = this.numerator;
        int b = this.denominator;
        
        int c = f.numerator;
        int d = f.denominator;
        
        //Fraction sum = new Fraction(a*d + b*c, b*d);
        //return sum;
        
        return new Fraction(a*d - b*c, b*d);
    }
    
    /**
     * Mutiplies fraction f to this fraction and return the product.
     * @param f fraction to multiply to this fraction.
     * @return product of 2 fractions.
     */
    public Fraction multiply(Fraction f) throws FractionException {
        int a = this.numerator;
        int b = this.denominator;
        
        int c = f.numerator;
        int d = f.denominator;
        
        //Fraction sum = new Fraction(a*d + b*c, b*d);
        //return sum;
        
        return new Fraction(a*c, b*d);
    }
    
    /**
     * Divides fraction f to this fraction and return the division.
     * @param f fraction to divide to this fraction.
     * @return division of 2 fractions.
     */
    public Fraction divide(Fraction f) throws FractionException {
        int a = this.numerator;
        int b = this.denominator;
        
        int c = f.numerator;
        int d = f.denominator;
        
        //Fraction sum = new Fraction(a*d + b*c, b*d);
        //return sum;
        
        return new Fraction(a*d, b*c);
    }
    
    public boolean isSimplified() {
        // Homework: return true if fraction is simplified, else return false
        // if gcd of numerator and denominator = 1 => true
        // else => false
        int g = gcd(numerator, denominator);
        if (g == 1) return true;
        else return false;
    }
    
    public Fraction simplify() throws FractionException {
        // Homework: return the simplified fraction
        // create a new fraction with numerator = this numerator / gcd, 
        // denominator = this denominator / gcd
        // return new fraction
        int g = gcd(numerator, denominator);
        int a = numerator / g;
        int b = denominator / g;
        return new Fraction(a, b);
    }
    private int gcd(int a, int b) {
        if (a > b) return gcd_rec(a, b);
        else return gcd_rec(b, a);
    }
    private int gcd_rec(int a, int b) {
        // Homework: return the greatest common divisor between a and b
        if (b == 0) return a;
        
        else return gcd(b, a % b);
    }
    /**
     * Compare and find min between 2 fractions.
     * @param f1 first fraction
     * @param f2 second fraction
     * @return the min fraction between 2 fractions.
     */
    public static Fraction min(Fraction f1, Fraction f2) {
        int a = f1.numerator;
        int b = f1.denominator;
        int c = f2.numerator;
        int d = f2.denominator;
        
        if (a*d < b*c) return f1;
        else return f2;
    }
    // Homework: max method
    public static Fraction max(Fraction f1, Fraction f2) {
        int a = f1.numerator;
        int b = f1.denominator;
        int c = f2.numerator;
        int d = f2.denominator;
        
        if (a*d > b*c) return f1;
        else return f2;
    }
    
}
