public class Factors {

    public static void main(String args[]){
        printFactors(32);

    }

    public static void printFactors(int number){
        int value=number;

        if(number<1){
            System.out.println("Invalid Value");
        }

        while(value>0){
            if(number%value==0){
                System.out.println(number/value);

                // comment check 
            }
            value--;
        }

    }
}
