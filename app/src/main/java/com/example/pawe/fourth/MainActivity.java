package com.example.pawe.fourth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startFrameLayoutActivity(View view) {
        Intent intent = new Intent(this,ActivityFrameLayout.class);
        startActivity(intent);
    }

    public void startLinearLayoutActivity(View view) {
        Intent intent = new Intent(this,ActivityLinearLayout.class);
        startActivity(intent);
    }

    public void startTableLayoutActivity(View view) {
        Intent intent = new Intent(this,ActivityTableLayout.class);
        startActivity(intent);
    }

    public void startGridLayoutActivity(View view) {
        Intent intent = new Intent(this,ActivityGridLayout.class);
        startActivity(intent);
    }

    public void startRelativeLayoutActivity(View view) {
        Intent intent = new Intent(this,ActivityRelativeLayout.class);
        startActivity(intent);
    }
}
