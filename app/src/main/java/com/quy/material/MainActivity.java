package com.quy.material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private CoordinatorLayout coordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnBar);
        coordinatorLayout = findViewById(R.id.coor);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(coordinatorLayout,"Something you like",3000);
                snackbar.setTextColor(Color.parseColor("#000000"));
                snackbar.setBackgroundTint(getColor(R.color.colorYellow));
                snackbar.setAction("Hello", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Need", Toast.LENGTH_SHORT).show();
                    }
                });
                snackbar.show();
            }
        });
    }
}