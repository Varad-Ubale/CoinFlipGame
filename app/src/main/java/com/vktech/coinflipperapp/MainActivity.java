package com.vktech.coinflipperapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewCoin;
    TextView textViewResult;
    Button buttonFlip;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewCoin = findViewById(R.id.imageViewCoin);
        textViewResult = findViewById(R.id.textViewResult);
        buttonFlip = findViewById(R.id.buttonFlip);
        random = new Random();

        buttonFlip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flipCoin();
            }
        });
    }

    private void flipCoin() {
        int flipResult = random.nextInt(2); // 0 or 1

        if (flipResult == 0) {
            textViewResult.setText("Heads");
            imageViewCoin.setImageResource(R.drawable.heads);
        } else {
            textViewResult.setText("Tails");
            imageViewCoin.setImageResource(R.drawable.tails);
        }
    }
}