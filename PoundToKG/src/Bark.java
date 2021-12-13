public class Bark {


    public static void main(String args[]){

        System.out.println(shouldWakeUp(true,23));
    }

    public static boolean shouldWakeUp(boolean barking,int hoursOfDay){
        if(hoursOfDay<0||hoursOfDay>24){
            return false;
    }else if(hoursOfDay<8&&barking==true){
            return true;
        }else if(hoursOfDay>22&&barking==true){
            return true;
        }else
        {
            return false;
        }

        }
}
