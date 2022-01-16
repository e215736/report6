package jp.ac.uryukyu.ie.e215736;
import java.util.Scanner;
public class Input {
    public static String inputNum(){
        // 引数で標準入力System.inを指定する
        Scanner scanner = new Scanner(System.in);
        //入力された内容をインスタンスから取得
        String input_text = scanner.nextLine();
        return input_text;
    }

}
