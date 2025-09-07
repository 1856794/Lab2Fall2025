
/**
 * Write a description of class Imprecision here.
 *  program to show imprecision
 * @author Robert Padilla
 * @version v1.0
 * @since 9/7/2025
 */
public class Imprecision
{
    public static void main (String[] args){
        double x, y, z;
        x = 12345.6789e200;
        y= 1/x;
        z = x*y;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("z is " + z);
        System.out.println("1-z is " + (1-z));
    }
    
    
}