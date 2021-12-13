import java.util.Arrays;

public class MilesToKilo {

    public static void main(String args[]){
printConversion(95.75);


    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour <0){
            return -1;
        }

        double miles=kilometersPerHour*0.621;

        return (long)miles;
    }

    public static void printConversion(double KilometerPerHour){

        if(KilometerPerHour<0){
            System.out.println("Invalid Value");

        }else {

            double milesPerHour1;
            milesPerHour1 = KilometerPerHour * 0.621371;
            long milesPerHour=Math.round(milesPerHour1);
            System.out.println(KilometerPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }
}
