package com.example.debugapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.ed1);
        e2=(EditText)findViewById(R.id.ed2);
        tv1=(TextView)findViewById(R.id.result);
    }

    public void doAdd(View view) {
        Log.i("Mainactivity","Executed 1");
        int a1= Integer.parseInt(e1.getText().toString());
        Log.i("Mainactivity","Executed 2");
        int a2= Integer.parseInt(e2.getText().toString());
        Log.i("Mainactivity","Executed 3");
        int res= a1+a2;
        Log.i("Mainactivity","Executed 4");
        tv1.setText(""+res);
        Log.i("Mainactivity","Executed 5");
    }
}
