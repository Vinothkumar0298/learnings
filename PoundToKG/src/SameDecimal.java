public class SameDecimal {

    public static void main(String args[]){
        System.out.println(areEqualByThreeDecimalPlaces(3.176,3.175));



    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two){

       int a=(int)(one*1000);
       int b=(int)(two*1000);

       if(a-b==0){
           return true;
       }
        return false;
    }
}
