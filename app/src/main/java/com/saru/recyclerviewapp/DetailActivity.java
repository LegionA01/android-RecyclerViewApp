package com.saru.recyclerviewapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView img;
    TextView title, desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img = findViewById(R.id.imgDetail);
        title = findViewById(R.id.tvTitle);
        desc = findViewById(R.id.tvDetail);

        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("desc");
        int image = getIntent().getIntExtra("image", 0);

        title.setText(name);
        desc.setText(description);
        img.setImageResource(image);
    }
}