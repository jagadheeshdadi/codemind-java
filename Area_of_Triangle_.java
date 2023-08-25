import java.util.*;
public class Okay{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        double a,b,c;
 
        a=m.nextDouble();
        b=m.nextDouble();
        c=m.nextDouble();
        double s = (a+b+c)/2;
        double area =Math.sqrt (s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}