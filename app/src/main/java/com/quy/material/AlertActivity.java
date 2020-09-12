package com.quy.material;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class AlertActivity extends AppCompatActivity {

    private Button button;
    private CharSequence[] charSequences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        button = findViewById(R.id.button);

        charSequences = new CharSequence[]{"Math","History","Biology","Other"};
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialAlertDialogBuilder d = new MaterialAlertDialogBuilder(AlertActivity.this);
                d.setTitle("Alert Dialog Example");

                d.setSingleChoiceItems(charSequences, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MaterialAlertDialogBuilder d1 = new MaterialAlertDialogBuilder(AlertActivity.this);
                        d1.setTitle("Alert Dialog Example");
                        d1.setMessage(charSequences[i]);
                        d1.show();
                        dialogInterface.dismiss();


                    }
                });
                
                d.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                d.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                d.show();

            }
        });
    }
}