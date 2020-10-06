package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.button);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //création du nombre aléatoire1
                Random rand = new Random();
                int nombre = rand.nextInt(6 - 1 + 1) + 1;
                TextView total = (TextView )findViewById(R.id.TextView);
                total.setText(String.valueOf( nombre ));

                //création du nombre aléatoire2

                int nombre2 = rand.nextInt(6 - 1 + 1) + 1;
                TextView total2 = (TextView )findViewById(R.id.TextView1);
                total2.setText(String.valueOf( nombre2 ));

            }
        });



    }


}