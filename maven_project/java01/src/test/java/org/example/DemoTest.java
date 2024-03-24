package org.example;/*
 * @Description:
 * @Update:
 * @UpdateRemark:
 */

import org.junit.Assert;
import org.junit.Test;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/03/13
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class DemoTest {
    @Test
    public void testSay() {
        Demo demo = new Demo();
        String say = demo.say("world");
        Assert.assertEquals("hello world", say);
    }
}
