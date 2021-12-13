import java.util.Enumeration;

public class SharedDigit {

    public static void main(String args[]){
        System.out.println(hasSharedDigit(19,99));

    }
    public static boolean hasSharedDigit(int one, int two){
        if((one<=10||one>99)||(two<=10||two>99)){
            return false;
        }
        int ofdigit;
        int oldigit;
        ofdigit=one/10;
        oldigit=one%10;

        int tfdigit=two%10;
        int tldigit=two/10;
        if((ofdigit==tfdigit)||(oldigit==tfdigit)||(ofdigit==tldigit)||(oldigit==tldigit)){
            return true;
        }else
        {
return false;
    }}

}
