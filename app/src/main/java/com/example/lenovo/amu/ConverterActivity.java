package com.example.lenovo.amu;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConverterActivity extends AppCompatActivity {

    Button converter;
    EditText eT;
    TextView tV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        eT=(EditText)findViewById(R.id.editText3);
        tV=(TextView)findViewById(R.id.txtViewY);

        //Code to convert metre into feet
        converter=(Button)findViewById(R.id.butConvert);
        converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    double dis_metre= Double.parseDouble(eT.getText().toString());
                    double distance_feet=dis_metre*3.14;
                    tV.setText(Double.toString(distance_feet));
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Enter valid distence in metre",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
