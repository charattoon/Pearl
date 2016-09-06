package com.mka.chara.jokesnotpearl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton button01 = (ImageButton) findViewById(R.id.imageButton);
        assert button01 != null;
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, Gallery01.class);
                startActivity(intent1);
            }
        });

        ImageButton button02 = (ImageButton) findViewById(R.id.imageButton2);
        assert button02 != null;
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Gallery02.class);
                startActivity(intent2);
            }
        });

        ImageButton button03 = (ImageButton) findViewById(R.id.imageButton3);
        assert button03 != null;
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, Gallery03.class);
                startActivity(intent3);
            }
        });

        ImageButton button04 = (ImageButton) findViewById(R.id.imageButton4);
        assert button04 != null;
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, Gallery04.class);
                startActivity(intent4);
            }
        });


        AdRequest.Builder adBuilder = new AdRequest.Builder();
        AdRequest adRequest = adBuilder.build();
        AdView adView = (AdView)findViewById(R.id.adView);
        adView.loadAd(adRequest);

    }
}
