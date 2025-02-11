package com.example.activitylifecycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate finished",Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart finished",Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume finished",Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause finished",Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop finished",Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart finished",Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy finished",Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onDestroy");
    }
}
