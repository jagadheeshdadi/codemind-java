import java.util.Scanner;
public class Sathi{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int l;
        l=n.nextInt();
        int result=l*(l-1)/2;
        System.out.println(result);
    }
}