public class SecondsToMins {


    public static void main(String args[]) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString( 3945));

    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds >= 60) {
            return "Invalid value";
        }
        int hours;
        hours = minutes / 60;
        int min = minutes - (hours * 60);
        String value = "" + hours + "h " + min + "m " + seconds + "s";
        return value;
    }


    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int min = seconds / 60;
        int remainingsec=seconds%60;
        return getDurationString(min, remainingsec);

    }
}
