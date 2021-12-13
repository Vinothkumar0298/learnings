public class MBConverter {

    public static void main(String args[]){
        printMegaBytesAndKiloBytes(2500);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }else {

            long  megaByte;
            megaByte= (long) ((long)kiloBytes/1024f);
            long remaining=(long)kiloBytes%1024;
            //long val=(long)remaining*100;
            System.out.println(kiloBytes + " KB = " + megaByte  + " MB and "+remaining+" KB");
            //System.out.println(val);

        }

    }
}
