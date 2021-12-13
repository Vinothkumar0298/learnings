public class CheckTeen {

    public static void main(String args[]){
        System.out.println(hasTeen(1,13,3));

    }

    public static boolean hasTeen (int one, int two, int three){

      return ((one>12)&&(one<20))||((two>12)&&(two<20))||((three>12)&&(three<20))?true:false;


    }

    public static boolean isTeen(int one){
        return (one>12&&one<20)?true:false;

    }
}
