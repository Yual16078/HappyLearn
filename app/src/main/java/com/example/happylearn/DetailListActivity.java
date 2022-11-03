package com.example.happylearn;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DetailListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);
        findViewById(R.id.bt_back).setOnClickListener(
                view -> {
                    DetailListActivity.this.finish();
                }
        );
    }
}