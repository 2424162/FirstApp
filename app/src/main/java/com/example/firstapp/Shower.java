package com.example.firstapp;

import android.util.Log;

public class Shower {

    public static String tag = "test";
    public class  Girl extends Oberver {
        @Override
        public void update() {
            Log.d(tag,"收到消息");
        }
    }
    public class Boy extends Oberver {

        @Override
        public void update() {
            Log.d(tag,"收到消息2");
        }
    }
}

