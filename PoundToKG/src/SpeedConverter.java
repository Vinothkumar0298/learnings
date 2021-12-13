public class SpeedConverter {

    public static void main(String args[]){
        System.out.println(toMilesPerHour(25.42));
    }

    public static long toMilesPerHour(double KilometersPerHour){
         long   miles;
        if(KilometersPerHour >=0){
            miles= (long) (KilometersPerHour*0.621371);
            return miles;
        }
        return -1;
    }
}
