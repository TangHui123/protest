package com.truly.tanghui.mylibrary;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by TangHui on 2017/8/31.
 */

public class TestClass {
    public static final int Test = 3;

    public TestClass() {
        super();
        EventBus.getDefault().isRegistered(this);
    }

    public int sum(int a, int b) {
        return (a + b) * Test;
    }
}
