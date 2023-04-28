package com.ashish.simple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.ImageButton;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText e1;
    TextView t1;
    ImageButton em,se;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.Write1);
        t1=findViewById(R.id.show);
        em=findViewById(R.id.emoji);
        se=findViewById(R.id.sent);

      em.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              t1.setText("Hello..");
          }
      });

        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String texget=e1.getText().toString();
              if(texget.isEmpty())
              {
                  Toast.makeText(MainActivity.this, "Please ,Write Something?", Toast.LENGTH_SHORT).show();
              }else{
                  t1.setText(texget);
                  e1.setText("");
              }

            }
        });



    }
}