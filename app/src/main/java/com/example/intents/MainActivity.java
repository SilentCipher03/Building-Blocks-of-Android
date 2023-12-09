package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonIntent = findViewById(R.id.button);

        buttonIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // We have to new activity in same app only

                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                startActivity(intent);
            }
        });


    }
}