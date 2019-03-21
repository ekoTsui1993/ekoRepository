package main.java.com.eko.common;

/**
 * 获取游戏数字编码
 * @author ekoTsui
 * @since 2019-3-21
 */
public class GameNumber {

    public static String getNumberCode(Integer num){
        if(num != null){
            //start game rule
            if(num%3==0 && num%5==0){
                //如果是3的倍数并且是5的倍数返回FizzBuzz
                return "FizzBuzz";
            }else if(num%3==0){
                //如果是3的倍数返回Fizz
                return "Fizz";
            }else if(num%5==0){
                //如果是5的倍数返回Buzz
                return "Buzz";
            }else{
                return String.valueOf(num);
            }

        }
        return "";
    }
}
