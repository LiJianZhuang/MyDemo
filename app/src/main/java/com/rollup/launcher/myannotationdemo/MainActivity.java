package com.rollup.launcher.myannotationdemo;

import android.support.annotation.DrawableRes;
import android.support.annotation.IntDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MainActivity.LiString(name = "li")
public class MainActivity extends AppCompatActivity {


    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface LiString {
        String name();
    }


    @InjectView(id = R.id.tv)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectViewUtils.injextView(this);
        textView.setText("哦买噶");

    }



    public static final int GAME = 1;
    public static final int BasketBall = 2;

    @IntDef(value = {GAME, BasketBall})
    @Target(ElementType.PARAMETER)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Interest {

    }

    public void setMyInterest(@Interest int like) {

    }

    public void setImage(@DrawableRes int id) {

    }



}
