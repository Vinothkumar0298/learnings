public class MethodChallenge {

    public static void main(String args[]){

    diplayHighScore("gowtham",7);
        System.out.println("option one"+calculateHighScorePosition(1500));
        System.out.println("option two"+calculateHighScorePosition(900));
        System.out.println("option three"+calculateHighScorePosition(400));
        System.out.println("option four"+calculateHighScorePosition(50));
    }

    public static void diplayHighScore(String playername,int position){
        System.out.println(""+playername+" managed to get the position "+position+" in the higher table");

    }

    public static int calculateHighScorePosition(int playerscore){
        if(playerscore>100&&playerscore<500){
            return 3;

        }
        else if(playerscore>500&&playerscore<1000){
            return 2;
        }
        else if (playerscore>1000){
            return 1;
        }
        return -1;

    }
}
