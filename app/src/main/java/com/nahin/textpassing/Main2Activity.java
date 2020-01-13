package com.nahin.textpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "nahin"; //com.example.application.example.EXTRA_TEXT

    Button button;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        textView = (TextView)findViewById(R.id.dd);




        Intent intent = getIntent();
        final String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);

        textView.setText("you are passing -> "+text);

        final int number = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        TextView textView1 = (TextView) findViewById(R.id.textview1);
        TextView textView2 = (TextView) findViewById(R.id.textview2);

        textView1.setText("go next");

        textView2.setText("" + number);

        button =(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                intent.putExtra(EXTRA_TEXT, text);

                startActivity(intent);
            }
        });



    }
}
