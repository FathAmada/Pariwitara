package com.stembayo.pariwitara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int  images[] = {R.drawable.yk_bringharjo, R.drawable.yk_kratonjogjakarta,
            R.drawable.yk_malioboro, R.drawable.yk_tamansari, R.drawable.yk_tugujogja};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.locationName);
        s2 = getResources().getStringArray(R.array.locationDescription);

        recyclerView_adapter adapter = new recyclerView_adapter(this, s1, s2, images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
