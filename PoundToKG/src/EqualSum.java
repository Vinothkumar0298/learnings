public class EqualSum {

    public static void main(String args[]){
        System.out.println(hasEqualSum(1,1,0));

    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {

        return  (firstNumber + secondNumber) ==  (thirdNumber);

    }
}
