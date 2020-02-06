package com.example.recyclerviewinfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout root = (LinearLayout) findViewById(R.id.root);

        LinearLayout linearLayoutOne = new LinearLayout(this);
        linearLayoutOne.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        linearLayoutOne.setOrientation(LinearLayout.HORIZONTAL);

        TextView login = new TextView(this);
        login.setText("Login");

        linearLayoutOne.addView(login);
        root.addView(linearLayoutOne);

        LinearLayout linearLayoutTwo = new LinearLayout(MainActivity.this);
        linearLayoutTwo.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT , LinearLayout.LayoutParams.WRAP_CONTENT));
        linearLayoutTwo.setOrientation(LinearLayout.HORIZONTAL);

        TextView password = new TextView(this);
        password.setText("Password");
        linearLayoutTwo.addView(password);

        Button loginBtn = new Button(this);
        loginBtn.setText("Submit");
        linearLayoutTwo.addView(loginBtn);

        root.addView(linearLayoutTwo);




    }

}
