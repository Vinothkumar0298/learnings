public class DigitalSumBalance {

    public static void main(String args[]){
        System.out.println(sumDigits(111));

    }

    public static int sumDigits(int number){
        int sum=0;
        if(number <10){

            return -1;
        }
        else {


sum=number;
            for(int i=0;number>=10;i++) {
                sum=sum+number%10;
                sum = sum + number / 10;
            }
            return sum;
        }
    }
}
