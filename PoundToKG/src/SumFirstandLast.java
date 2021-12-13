public class SumFirstandLast {

    public static void main(String args[]){
        System.out.println(sumFirstAndLastDigit(5));

    }
    public static int sumFirstAndLastDigit(int number){
       if(number<0){
           return -1;
       }
       int lastdigit=number%10;
       int firstdigit=number%10;
       while(number>=10){
            firstdigit=number/10;
            number=firstdigit;
       }

       int sum=firstdigit+lastdigit;
       return sum;
    }
}
