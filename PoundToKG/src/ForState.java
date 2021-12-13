public class ForState {

    public static void main(String args[]) {
        //System.out.println( calculateInterest(200,7));
        int intrate=2;

        for(int i=0;i<7;i++){


            System.out.println( calculateInterest(10000,intrate));
            intrate++;
        }

    }

    public static double calculateInterest(double amount, double interestrate) {


        return amount*(interestrate/100);
    }
}
