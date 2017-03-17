package com.chen.imageload;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

/**
 * Created by chenzhaohua on 17/2/27.
 */

public class UniversalImageLoaderActivity extends Activity {

    private ImageView iv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universal);

        iv_test = (ImageView) findViewById(R.id.iv_test);
        loadImage();

    }


    private void loadImage() {

        ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(this));
        ImageLoader.getInstance().loadImage(Constant.URL, new ImageLoadingListener() {
            @Override
            public void onLoadingStarted(String s, View view) {
                LogHelper.d("onLoadingStarted = " + s);
            }

            @Override
            public void onLoadingFailed(String s, View view, FailReason failReason) {
                LogHelper.d("onLoadingFailed = " + s);
            }

            @Override
            public void onLoadingComplete(String s, View view, Bitmap bitmap) {
                LogHelper.d("onLoadingComplete = " + s);
            }

            @Override
            public void onLoadingCancelled(String s, View view) {
                LogHelper.d("onLoadingCancelled = " + s);
            }
        });

    }

}
