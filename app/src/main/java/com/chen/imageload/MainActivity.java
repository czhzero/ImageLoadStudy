package com.chen.imageload;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_1).setOnClickListener(this);
        findViewById(R.id.tv_2).setOnClickListener(this);
        findViewById(R.id.tv_3).setOnClickListener(this);
        findViewById(R.id.tv_4).setOnClickListener(this);
    }


    private void jumpToActivity(Class c) {
        Intent intent = new Intent();
        intent.setClass(this, c);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {

        Class c = null;

        switch (v.getId()) {
            case R.id.tv_1:
                c = UniversalImageLoaderActivity.class;
                break;
            case R.id.tv_2:
                c = PicassoActivity.class;
                break;
            case R.id.tv_3:
                c = GlideActivity.class;
                break;
            case R.id.tv_4:
                c = FrescoActivity.class;
                break;
        }

        jumpToActivity(c);

    }
}
