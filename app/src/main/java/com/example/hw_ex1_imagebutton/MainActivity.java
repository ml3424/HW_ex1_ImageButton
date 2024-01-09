package com.example.hw_ex1_imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    ImageButton imBtn1;
    Random rnd = new Random();
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.iv);
        imBtn1 = findViewById(R.id.imBtn1);
    }

    public void click(View view) {
        num = rnd.nextInt(3)+1;
        if(num == 1)
        {
            iv.setImageResource(R.drawable.hellokitty1);
            imBtn1.setImageResource(R.drawable.one);
        }
        else if(num == 2)
        {
            iv.setImageResource(R.drawable.hellokitty2);
            imBtn1.setImageResource(R.drawable.two);
        }
        else
        {
            iv.setImageResource(R.drawable.hellokitty3);
            imBtn1.setImageResource(R.drawable.three);
        }
    }
}