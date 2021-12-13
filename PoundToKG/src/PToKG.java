import java.util.Scanner;

public class PToKG {

    public static void main(String args[]){
        System.out.println("Hello");

        double pounds;
        int kg;

        Scanner sc=new Scanner(System.in);
        pounds=sc.nextDouble();

        kg=(int) (pounds*0.45359237);
        System.out.println("your weight in kg is "+kg);
    }
}
