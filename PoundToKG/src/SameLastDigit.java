public class SameLastDigit {

    public static void main(String args[]){
        System.out.println(hasSameLastDigit(13,15,23));

    }

    public static boolean hasSameLastDigit(int one, int two, int three){
        if(!((isValid(one))&&(isValid(two))&&(isValid(three)))){
            return false;
        }
            int olast,tlast,threelast;
            olast=one%10; tlast=two%10;threelast=three%10;
            if((olast==tlast)||(olast==threelast)||(tlast==threelast)){
                return true;}
            else {

                return false;
            }
        }



    public static boolean isValid(int number){

            return number>=10&&number<=1000;

    }
}
