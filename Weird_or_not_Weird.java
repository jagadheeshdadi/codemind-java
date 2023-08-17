import java.util.Scanner;
public class Narsi{
    public static void main(String [] args){
        int l;
        Scanner e= new Scanner(System.in);
        l=e.nextInt();
        if(l%2!=0){
            System.out.println("weird");
        }
        else
        {
            if(l >=2 && l<=5)
            {
                System.out.println("not weird");
            }
            else if(l>=6 && l<=20){
                System.out.println("weird");
            }
            else if(l>=20)
            {
                System.out.println("not weird");
            }
        }
        // else if(l%2==0 && l<=6 && l>=20){
        //     System.out.println("weird");
        // }
        // else if(l%2==0 && l<=20){
        //     System.out.println("not weird");
        // }
    }
}