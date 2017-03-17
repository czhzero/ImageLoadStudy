package com.chen.imageload;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by chenzhaohua on 17/2/27.
 */

public class PicassoActivity extends Activity {

    private ImageView iv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);
        iv_test = (ImageView) findViewById(R.id.iv_test);



    }

}
