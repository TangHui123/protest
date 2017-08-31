package com.truly.tanghui.protest;

/**
 * Created by TangHui on 2017/8/31.
 */

public class MyMath {

    public int sum(int a, int b) {
        return a + b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public String compat(String a, String b, String c) {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(a).append(b).append(c).toString();
    }
}
