package com.example.counterappdsc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button increment;
    Button decrement;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increment=findViewById(R.id.button);
        decrement=findViewById(R.id.button2);
        result=findViewById(R.id.num_textview);
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=result.getText().toString();
                int i=Integer.parseInt(temp);
                i=i+1;
                result.setText(Integer.toString(i));

            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String already=result.getText().toString();
                int j=Integer.parseInt(already);
                j--;
                result.setText(Integer.toString(j));

            }
        });

    }
}