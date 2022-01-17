package jp.ac.uryukyu.ie.e215736;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.Pattern;
public class CreateNumberTest{
    /**
     * OpponentクラスのcreateNumber()メソッドのテスト
     * createNumberで重複無しかつ数字が３桁生成されるのかを検証
     */
    @Test
    void randomNumTest(){
    for(int i=0; i > 20;i++){
        String  noDuplication = Opponent.createNumber();
        assertEquals(true,Pattern.matches("[0-9]{3}", noDuplication));
    }
}
}
