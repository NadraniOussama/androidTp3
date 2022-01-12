package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//import androidx.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button main_btn;

    private EditText txt1,txt2,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView) findViewById(R.id.textView);
        main_btn=(Button) findViewById(R.id.main_btn);

        txt1=(EditText)findViewById(R.id.txt1);
        txt2=(EditText)findViewById(R.id.txt2);
        age=(EditText)findViewById(R.id.age);

        main_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,SecondActivity.class);

                String name1=txt1.getText().toString();
                String name2=txt2.getText().toString();

                int name3=Integer.parseInt(age.getText().toString());

                Personne p = new Personne(name1,name2,name3);

                i.putExtra("my_name1", p);

                startActivity(i);

            }
        });
    }
}