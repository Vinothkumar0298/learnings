public class TimeCalcularot {

    public static void main(String args[]){
        printYearsAndDays(525600);



    }
    public static void printYearsAndDays(long minutes){
        int years;
        int days;
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            years = (int) ((minutes / 60) / 24) / 365;
            days = (int) ((minutes / 60) / 24) % 365;
            System.out.println("" + minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
