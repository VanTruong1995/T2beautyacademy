package com.example.vantruong.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ss.com.bannerslider.Slider;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        View include9 = (View) findViewById(R.id.include9);
        final Slider slider;
        Slider.init(new PicassoImageLoadingService(this));
        slider = (Slider) findViewById(R.id.banner_slider1);

        //delay for testing empty view functionality
        slider.postDelayed(new Runnable() {
            @Override
            public void run() {
                slider.setAdapter(new MainSliderAdapter());
                slider.setSelectedSlide(0);
            }
        }, 1500);


//        slider.setAdapter(new MainSliderAdapter());
    }
}
