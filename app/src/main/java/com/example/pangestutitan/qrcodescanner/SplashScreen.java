package com.example.pangestutitan.qrcodescanner;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;


public class SplashScreen extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_spalsh_screen);

        tv = (TextView) findViewById(R.id.tv);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();

            }

        }, 3000L); //1000 L =  1 detik
        Toast.makeText(this, "Selamat Datang <3", Toast.LENGTH_LONG);
    }
}
