public class KiloToMile {


    public static void main(String args[]){
        printCoverter(10);

    }

    public static void printCoverter(double kiloperhour){
        double miles=kiloperhour*0.621;
        System.out.println(kiloperhour + "km/hrs is equal to "+miles+" Miles ");

    }
}
