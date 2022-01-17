package jp.ac.uryukyu.ie.e215736;

import java.util.Collections;
import java.util.ArrayList;

/**
 * 対戦相手クラス
 *  String name; //敵の名前
 */
public class Opponent {
    private String name;

    public Opponent(String name) {
        /**
         * コンストラクタ。名前を指定する。
         * ＠param name 敵の名前
         */
        this.name = name;
    }

      /**
     * 保持する名前を返します。
     * @return 名前
     */
    public String getName() {
        return name;
    }

    /**
     * ランダムで重複なしの数字３桁を生成するメソッド。
     * 呼び出すごとに数字が変わる。
     * @return 重複無しの数字３桁
     * */
    public static String createNumber() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int answer = 0;
        String answerStr = "";
        // 1～9の整数値を持つリストを用意
        for (int i = 0; i <= 9; i++) {
            list.add(i);
        }
        // shuffleメソッドで上で作ったリストをシャッフル
        Collections.shuffle(list);
        for (int i = 0; i <= 2; i++) {
            if (i == 0) {
                answer += list.get(i) * 100;
            } else if (i == 1) {
                answer += list.get(i) * 10;
            } else if (i == 2) {
                answer += list.get(i);
            }
            answerStr = String.format("%03d", answer);
        }

        return answerStr;
    }

}
