import jp.ac.uryukyu.ie.e215736.*;

/**
 * 実行するためのMainクラス
 */
public class Main {
 /**
 * メインメソッド
 * 数当てゲームをします
 */
    public static void main(String[] args) {
        Opponent opponent = new Opponent("変幻自在の乱数エネミー");
        System.out.println(opponent.getName() + "が現れました。\n 相手の数字３ケタを当てて、撃退しましょう。");
        System.out.println("用語説明：数字とその場所が合っていた場合は｢EAT｣ \n 数字は合っているが、桁の場所が違う場合は｢BITE｣となる｡");
        System.out.println("Ex.相手の番号が｢567｣で、コールされた番号が｢769｣であった場合は　\n < 1EAT ~ 1BITE >となる｡");
        // 乱数３桁を固定する
        String opNum = Opponent.createNumber();
        //したのコード１行のスラッシュを消すとランダム生成された数字がわかる
        //System.out.println(opNum);
        int tried = 0;
        while (true) {
            // 入力を促すテキスト
            System.out.print("任意の重複無しの数字3桁を半角で入力してください > ");
            // 入力された数字を上書きして保存
            String plNum = Input.inputNum();
            // 生成した数字と入力された数字を比べてEATとBITE数を調べる
            int eat = GameRule.countEat(opNum, plNum);

            int bite = GameRule.countBite(opNum, plNum);
            System.out.println("--------------------------");
            System.out.println("\n < " + eat + " EAT  ~  " + bite + " BITE >\n");
            System.out.println("--------------------------");
            tried += 1;
            // EAT数が3なら勝ち
            if (eat == 3) {
                break;
            }
        }
        System.out.println("おめでとう！！");
        System.out.printf("%s回目のトライで撃破!!!\n", tried);

    }
}
