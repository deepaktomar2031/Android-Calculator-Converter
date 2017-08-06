package com.example.lenovo.amu;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    Button add,sub,mul,div;
    EditText e1,e2;
    TextView tV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        tV=(TextView)findViewById(R.id.txtViewX);

        //addition code
        add=(Button)findViewById(R.id.butAdd);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    double x,y;
                    x=Double.parseDouble(e1.getText().toString());
                    y=Double.parseDouble(e2.getText().toString());
                    double result=x+y;
                    tV.setText(Double.toString(result));

                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"PLZ ENTER VALID VALUES X,Y",Toast.LENGTH_SHORT).show();
                }

            }
        });


        //subtraction code
        sub=(Button)findViewById(R.id.butSub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    double x,y;
                    x=Double.parseDouble(e1.getText().toString());
                    y=Double.parseDouble(e2.getText().toString());
                    double result=x-y;
                    tV.setText(Double.toString(result));
                }
                 catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"PLZ ENTER VALID VALUES X,Y",Toast.LENGTH_SHORT).show();
                }

            }
        });


        //multiply code
        mul=(Button)findViewById(R.id.butMul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    double x,y;
                    x=Double.parseDouble(e1.getText().toString());
                    y=Double.parseDouble(e2.getText().toString());
                    double result=x*y;
                    tV.setText(Double.toString(result));
                }
                 catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"PLZ ENTER VALID VALUES X,Y",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //division code
        div=(Button)findViewById(R.id.butDiv);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    double x,y;
                    x=Double.parseDouble(e1.getText().toString());
                    y=Double.parseDouble(e2.getText().toString());
                    if(y==0)
                    {
                        tV.setText("Denominator Cant be Zero");
                    }
                    else
                    {
                        double result=x/y;
                        tV.setText(Double.toString(result));
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"PLZ ENTER VALID VALUES X,Y",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
