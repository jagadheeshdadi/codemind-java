import java.util.Scanner;
public class Sathi{
    public static void main(String[] args){
        Scanner M = new Scanner(System.in);
        int t,s,b;
        t=M.nextInt();
        s=M.nextInt();
        b=M.nextInt();
        int result=2*t*s*b*512;
        System.out.println(result);
    }
}