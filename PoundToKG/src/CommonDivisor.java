public class CommonDivisor {

    public static void main(String args[])
    {
        System.out.println(getGreatestCommonDivisor(81,153));

    }

    public static int getGreatestCommonDivisor(int first, int second){

        int value=0;

        if(first<10||second<10){
            return -1;
        }

        for(int i=1;i<=first;i++){
            if(first%i==0){
                if(second%i==0){
                    value=i;
                }
            }
        }
        return value;

    }

}
