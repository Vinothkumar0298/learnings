public class ChecingPalaindrome {

    public static void main(String args[]){
        System.out.println(isPalindrome(-222));
    }

        public static boolean isPalindrome(int number){

            int stored=number;
            int digit;
            int reverse=0;
            boolean isnegative=(number<0)?true:false;
            if(isnegative){
               stored=number*-1;
                        }

            while(stored>0){
                digit=stored%10;
                reverse=(reverse*10)+digit;
                stored/=10;
            }
            if (isnegative){
                reverse=reverse*-1;
            }
            if (reverse==number){
                return true;
            }
            else {
                return false;
            }
        }
}
