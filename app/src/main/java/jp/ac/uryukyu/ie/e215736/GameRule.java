package jp.ac.uryukyu.ie.e215736;

public class GameRule {
    public static int countEat(String opNumber, String plNumber) {
        int countE = 0;
        for (int i = 0; i < opNumber.length(); i++) {
            if (plNumber.charAt(i) == opNumber.charAt(i)) {
                countE += 1;
            }
        }
        return countE;
    }

    public static int countBite(String opNumber, String plNumber) {

        int countB = 0;
        for (int i = 0; i < opNumber.length(); i++) {
            if (i==0){
                if (plNumber.charAt(0) == opNumber.charAt(1) | plNumber.charAt(0) == opNumber.charAt(2)) {
                    countB += 1;
                }
            }else if (i==1){
                if (plNumber.charAt(1) == opNumber.charAt(0)| plNumber.charAt(1) == opNumber.charAt(2)) {
                    countB += 1;
                }
            }else if (i==2){
                if (plNumber.charAt(2) == opNumber.charAt(0)| plNumber.charAt(2) == opNumber.charAt(1)) {
                    countB += 1;
                }
            }
        }
        return countB;
    }
}
