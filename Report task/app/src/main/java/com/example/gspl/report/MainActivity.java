package com.example.gspl.report;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.bt1);
        button2=findViewById(R.id.bt2);
        button3=findViewById(R.id.bt3);

    }

    public void but1(View view) {
        Intent intent=new Intent(MainActivity.this,Material_Report.class);
        startActivity(intent);

    }

    public void but2(View view) {
        Intent intent=new Intent(MainActivity.this,Vechicle_Report.class);
        startActivity(intent);

    }

    public void but3(View view) {

        Intent intent=new Intent(MainActivity.this,Eod_Report.class);
        startActivity(intent);
    }

    public void but4(View view) {

        Intent intent=new Intent(MainActivity.this,Emergency_Report.class);
        startActivity(intent);

    }
}
