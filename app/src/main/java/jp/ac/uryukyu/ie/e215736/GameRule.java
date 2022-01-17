package jp.ac.uryukyu.ie.e215736;
/**
 * ゲームルールクラス。
 */
public class GameRule {
    /**
     * プレイヤーが入力した数とランダム生成した数を比較してEATの数をカウントするメソッド
     * @param opNumber　ランダム生成によって作った数
     * @param plNumber  プレイヤーが入力した数
     * @return EATの数
     */
    public static int countEat(String opNumber, String plNumber) {
        int countE = 0;
        for (int i = 0; i < opNumber.length(); i++) {
            if (plNumber.charAt(i) == opNumber.charAt(i)) {
                countE += 1;
            }
        }
        return countE;
    }

    /**
     * プレイヤーが入力した数とランダム生成した数を比較してBITEの数をカウントするメソッド
     * @param opNumber ランダム生成によって作った数
     * @param plNumber プレイヤーが入力した数
     * @return BITEの数
     */
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
