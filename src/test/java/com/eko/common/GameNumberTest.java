package com.eko.common;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 数字编码游戏排序（单元测试）
 * @author ekoTsui
 * @since 2019-3-21
 */
public class GameNumberTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("now game begin");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("game end");
    }

    @Test
    public void getNumberCode() {
        //从1到100输出数字编码
        for (int i = 1;i <= 100 ; i ++){
            System.out.println(main.java.com.eko.common.GameNumber.getNumberCode(i));
        }
    }
}