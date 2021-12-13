public class SwitchABC {

    public static void main(String args[]){
        checkAlpha('b');


    }


    public static void checkAlpha(Character checks){
        /*String name=checks.toString();
        char[] allval=name.toUpperCase().toCharArray();
        char val=allval[0];*/

        char val=checks;

        switch (val){
            case 'A':
                System.out.println("this is character A");
                break;

            case 'B':
                System.out.println("this is character B");
                break;


            case 'C':
                System.out.println("this is character C");
                break;
            default:
                System.out.println("there is no A or B or C given");

        }
    }
}
