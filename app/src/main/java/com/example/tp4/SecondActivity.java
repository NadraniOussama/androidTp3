package com.example.tp4;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private Button second_btn;
    private TextView txtView3,txtView4,txtView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        second_btn=(Button) findViewById(R.id.second_btn);
        txtView3=(TextView) findViewById(R.id.textView3);
        txtView4=(TextView) findViewById(R.id.textView4);
        txtView5=(TextView) findViewById(R.id.textView5);


        Personne name1 = (Personne) getIntent().getSerializableExtra("my_name1");


        txtView3.setText(name1.getNom().toString());
//          txtView3.setText(name1.toString());
        txtView4.setText(name1.getPrenom().toString());
        txtView5.setText(name1.getAge()+"");

        second_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }
}
