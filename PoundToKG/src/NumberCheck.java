public class NumberCheck {

    public static void main(String args[]) {
        checkNumber(5);
        checkNumber(0);
        checkNumber(-1);
    }

    public static void checkNumber(int number) {
        String result = "";

        result = (number > 0) ? "Positive" : "negative";
        if (number == 0) {
            System.out.println(result);

        }
    }
}

