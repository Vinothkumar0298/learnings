public class MetodOverloadingChallenge {

    public static void main(String[] args){
        System.out.println(calcFeetandInchesToCentimeter(5,10));
        System.out.println(calcFeetandInchesToCentimeter(24));


    }

    public static double calcFeetandInchesToCentimeter(int feet, int inches){
        double centi;
        if(feet>=0 && inches >=0&& inches<=12){
            centi=feet*30.48+inches*2.54;

        }
        else{
            return -1;
        }
        return centi;
    }


    public static double calcFeetandInchesToCentimeter( int inches){
        double feet;
        if(inches >=0){
            feet=inches/12;

        }
        else{
            return -1;
        }
        return feet;
    }
}
