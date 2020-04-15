package com.example.test0318;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class ShowBMIctivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bmictivity);


        Bundle bundle = this .getIntent().getExtras();
        String h = bundle.getString("height");
        String w = bundle.getString("weight");
        String n = bundle.getString("name");


        Double bmi = Double.parseDouble(w)/(Double.parseDouble(h)/100*Double.parseDouble(h)/100);
        DecimalFormat df =new DecimalFormat( "#.##" );


        String msg = "";
        if(bmi<18.5) {
            msg = "過輕";
            view1.setImageResource(R.drawable.a1);
        } else if (bmi>25) {
            msg = "過重";
            view1.setImageResource(R.drawable.a2);
        } else {
            msg = "標準";
            view1.setImageResource(R.drawable.a3);
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        b.setText(name.getText().toString()+"您的BMI是" + df.format(bmi));
    }
    }
}


