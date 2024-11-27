package com.example.zad5;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView polubienia;
    private Button polub;
    private Button usun;
    private int count;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 0;
        usun = findViewById(R.id.usun);
        polubienia = findViewById(R.id.polubienia);
        polub = findViewById(R.id.polub);
        polub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                polubienia.setText(count + " polubien");
            }


        });
        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count > 0) {
                    count--;
                }
                ;
                polubienia.setText(count + " polubien");
            }
        });
    }
}
