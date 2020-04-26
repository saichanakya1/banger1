package com.example.androidpatternlockv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.text.DateFormat;
import java.util.Calendar;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void doSomething(View v) {
        switch (v.getId()){
            case R.id.button1:
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com"));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                break;

            case R.id.button2:
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://www.facebook.com"));
                if (intent1.resolveActivity(getPackageManager()) !=null)
                    startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("https://www.youtube.com/"));
                if (intent2.resolveActivity(getPackageManager()) !=null)
                    startActivity(intent2);
                break;

            case R.id.button4:
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("https://www.instagram.com/"));
                if (intent3.resolveActivity(getPackageManager()) !=null)
                    startActivity(intent3);
                break;
            case R.id.button5:
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                intent4.setData(Uri.parse("https://www.tiktok.com/"));
                if (intent4.resolveActivity(getPackageManager()) !=null)
                    startActivity(intent4);
                break;


        }}}
