package com.example.ex08;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton button;
    ImageView img;
    int random = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        img = findViewById(R.id.img);
    }

    public void clicked(View view) {

        random = (int) ((Math.random() * 3) + 1);

        if (random == 1) {
            img.setImageResource(R.drawable.img1); //
            button.setImageResource(R.drawable.img4);
        }
        else if (random == 2) {
            img.setImageResource(R.drawable.img2);
            button.setImageResource(R.drawable.img5);
        }
        else if (random == 3) {
            img.setImageResource(R.drawable.img3);
            button.setImageResource(R.drawable.img6);
        }
    }
}