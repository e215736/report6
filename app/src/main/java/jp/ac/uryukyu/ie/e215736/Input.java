package jp.ac.uryukyu.ie.e215736;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 入力クラス
 */
public class Input {
    /**
     * 入力された内容が条件に合うまで繰り返し、条件に会うものは出力されるメソッド。
     * @return　重複なしの入力した数字３桁
     */
    public static String inputNum() {
        Scanner scanner = new Scanner(System.in);
        // 入力された内容をインスタンスから取得
        String input_text = "";
        int firstSkip = 0;
        do {
            if (firstSkip > 0)  {
                System.out.print(" !入力に誤りがあります。指定通りに数字を入力してください! > ");
            }
            input_text = scanner.nextLine();
            firstSkip += 1;

        } while ((input_text.isEmpty() == true) || (input_text.length() != 3) || ( input_text.getBytes().length != input_text.length()) && (Pattern.matches("^[0-9]{3}", input_text) != true));
        return input_text;
    }
}
