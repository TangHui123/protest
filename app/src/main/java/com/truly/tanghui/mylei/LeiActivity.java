package com.truly.tanghui.mylei;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.truly.tanghui.mylibrary.TestClass;
import com.truly.tanghui.protest.MyMath;

import org.greenrobot.eventbus.EventBus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lei);
        EventBus.getDefault().isRegistered(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        regex();
        MyMath myMath = new MyMath();
        String sum = myMath.compat("1", "2", "3");
    }

    private void regex() {
        String aa = "13220925599";
        String regex = "^(1[3-9][0-9])\\d{8}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(aa);
        boolean bb = matcher.matches();
        Log.v("test", "bb="+bb);
        Log.v("test", "matcher=" + matcher.find());

        TestClass testClass = new TestClass();
        testClass.sum(10, 20);

    }
}
