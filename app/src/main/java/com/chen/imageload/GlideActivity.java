package com.chen.imageload;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * Created by chenzhaohua on 17/2/27.
 */

public class GlideActivity extends Activity {

    private ImageView iv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        iv_test = (ImageView) findViewById(R.id.iv_test);
        Glide.with(this).load(Constant.URL).into(iv_test);
    }
}
