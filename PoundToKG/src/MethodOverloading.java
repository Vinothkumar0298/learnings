public class MethodOverloading {

    public static void main(String[] args){
        int newscore=calculateScore("gowtham",500);
        System.out.println("new score is "+newscore);

        calculateScore(300);
    }


    public static int calculateScore(String playername, int score){
        System.out.println("the player name is "+playername+" and his score is "+score);

        return score*1000;


    }
    public static int calculateScore(int score){
        System.out.println("unnamed player and his score is "+score);

        return score*1000;


    }

    public static int calculateScore(){
        System.out.println("no player  his score to display");

        return 0;


    }
}
