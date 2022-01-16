import jp.ac.uryukyu.ie.e215736.*;

public class Main {
    public static void main(String[] args) {
        Opponent opponent = new Opponent("乱数エネミー");
        System.out.println(opponent.getName() + "が現れました");
        // 乱数３桁を固定する
        String opNum = Opponent.createNumber();
        System.out.println(opNum);
        int tried = 0;
        while (true) {
            // 入力を促すテキスト
            System.out.print("任意の重複無しの数字3桁を半角で入力してください > ");
            // 入力された数字を上書きして保存
            String plNum = Input.inputNum();
            // 生成した数字と入力された数字を比べてEATとBITE数を調べる
            int eat = GameRule.countEat(opNum, plNum);

            int bite = GameRule.countBite(opNum, plNum);

            System.out.println("\n < " + eat + " EAT  ~  " + bite + " BITE >\n");
            tried += 1;
            // EAT数が3なら勝ち
            if (eat == 3) {
                break;
            }
        }
        System.out.println("おめでとう！！");
        System.out.printf("%s回目のトライで正解!!!\n", tried);

    }
}
