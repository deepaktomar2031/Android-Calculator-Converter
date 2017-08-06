package com.example.lenovo.amu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button butCalculator,butConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butCalculator=(Button)findViewById(R.id.buttonCal);
        butConverter=(Button)findViewById(R.id.butConv);

        butCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,CalculatorActivity.class);
                startActivity(intent);
            }
        });

        butConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,ConverterActivity.class);
                startActivity(intent);
            }
        });
    }
}
