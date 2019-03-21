package main.java.com.eko;

import main.java.com.eko.common.GameNumber;

/**
 * 游戏测试
 * @author ekoTsui
 * @since 2019-3-21
 */
public class GameTest {

    public static void main(String[] args) {
        System.out.println("now game begin");
        //从1到100输出数字编码
        for (int i = 1;i <= 100 ; i ++){
            System.out.println(GameNumber.getNumberCode(i));
        }
        System.out.println("end");
    }
}
