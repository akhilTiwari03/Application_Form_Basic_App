package com.example.applicationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ApplicationForm2 extends AppCompatActivity {
    TextView textView2 , textView3, textView5;
    Button back , next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_form2);

        textView2 = findViewById(R.id.textView);
        textView3 = findViewById(R.id.textView3);
        textView5 = findViewById(R.id.textView5);
        back = findViewById(R.id.back);
        next = findViewById(R.id.next);
        Intent intent = getIntent();
        String ans = intent.getStringExtra(MainActivity.EXTRA_NAME);
        textView2.setText(ans);

    }
    public void clicknext(View v) {

        Intent intent1 = new Intent(this , MainActivity3.class);
        startActivity(intent1);
    }
    public void clickback(View v1) {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }

}