package com.xkcoding.design.pattern.structural.proxy.dynamicproxy.cglib.run;

import com.xkcoding.design.pattern.structural.proxy.MusicTicket;
import com.xkcoding.design.pattern.structural.proxy.dynamicproxy.cglib.Conductor;
import com.xkcoding.design.pattern.structural.proxy.dynamicproxy.cglib.TrainTicket;

/**
 * <p>
 * 代理模式 - 动态代理 - CGLIB动态代理，测试类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019-08-20 23:16
 */
public class PatternTest {
    public static void main(String[] args) {
        // 代理火车票
        TrainTicket trainTicket = (TrainTicket) new Conductor().getInstance(TrainTicket.class);
        trainTicket.sell();

        // 代理演唱会门票
        MusicTicket musicTicket = (MusicTicket) new Conductor().getInstance(MusicTicket.class);
        musicTicket.sell();
    }
}
