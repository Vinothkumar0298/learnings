public class SwitchDayOFTheWeek {


    public static void main(String args[]){
        dayOfWeek(-1);
        dayOfweeks(0);

    }


    public static void dayOfWeek(int daynumb){
        switch (daynumb){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid day");
                break;

        }
    }


    public static void dayOfweeks(int daynumb){
        if(daynumb==0){
            System.out.println("this is sunday");
        }else if (daynumb==1){
            System.out.println("this is monday");
        }else if(daynumb==2){
            System.out.println("this is tuesday");
        }else if(daynumb==3){
            System.out.println("this is wednesday");
        }else{
            System.out.println("this is invalid day");
        }
    }
}
