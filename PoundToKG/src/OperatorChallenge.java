public class OperatorChallenge {


    public static void main(String args[]) {
        System.out.println("hello");

        double varone = 20.00d;
        double vartwo = 80.00d;
        double mulans = (varone + vartwo) * 100;
        double remind = mulans % 40.00d;
        //remind=mulans % remind;
        System.out.println(remind);
        boolean val=(remind==0)?true:false;


        /*if (remind == 0) {
            val = true;
        } else if (remind == 4) {
            val = false;
            System.out.println("we got some reminder");
        }*/

        if(!val){
            System.out.println("we got some reminder");
        }

    }
}
