package com.example.week3b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.util.StringBuilderPrinter;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DatePicker picker1;
        Button displayDate;
        final TextView textview1;
        textview1=(TextView)findViewById(R.id.textview1);
        picker1=(DatePicker)findViewById(R.id.dp);
        displayDate=(Button)findViewById(R.id.button1);

        final int i=picker1.getYear();

        textview1.setText("pick your dob:");

        displayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int j=picker1.getYear();
                textview1.setText(String.valueOf(i-j)+"years");
            }
        });
    }
}