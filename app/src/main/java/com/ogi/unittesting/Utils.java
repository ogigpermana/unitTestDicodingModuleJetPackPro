package com.ogi.unittesting;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.Date;

class Utils {
    @SuppressLint("SimpleDateFormat")
    static String toSimpleString(Date date){
        return new SimpleDateFormat("EEE, dd MMM yyy").format(date);
    }
}
