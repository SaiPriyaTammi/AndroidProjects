package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String petNames[],colors[];

    int imageResources[]= {R.drawable.forest_icon,R.drawable.fruit,R.drawable.forest_icon,R.drawable.fruit,R.drawable.forest_icon,R.drawable.fruit,R.drawable.forest_icon,R.drawable.fruit,R.drawable.forest_icon,R.drawable.fruit};
    MyOwnAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.rv);
        petNames=getResources().getStringArray(R.array.pet_names);
        colors=getResources().getStringArray(R.array.colors);

        ad= new MyOwnAdapter(this,petNames,colors,imageResources);
        recyclerView.setAdapter(ad);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
