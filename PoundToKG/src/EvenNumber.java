public class EvenNumber {

    public static void main(String args[]){
        System.out.println(isEvenNumber(5));

        int number=4;
        int finishnumber=20;
        int count=0;
        while(number <=finishnumber){
            number++;
            if(isEvenNumber(number)){
                System.out.println("the even numbers are "+number);
                count++;
                if(count==5){
                    break;
                }

            }
            else
            {
                continue;
            }
           // number++;
        }

    }

    public static boolean isEvenNumber(int num){
        //String value="Not a even number" ;
        if(num%2==0){
            return true;
        }else {
            return false;
        }


    }
}
