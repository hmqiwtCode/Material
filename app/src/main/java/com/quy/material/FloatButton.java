package com.quy.material;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FloatButton extends AppCompatActivity {

    private FloatingActionButton btnAdd, btnAddUser, btnAddContact;
    private TextView tvAddContact, tvAddPerson;
    private boolean isOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_float_button);

        btnAdd = findViewById(R.id.btnAdd);
        btnAddUser = findViewById(R.id.btnAddUser);
        btnAddContact = findViewById(R.id.btnAddContact);
        tvAddContact = findViewById(R.id.tvAddContact);
        tvAddPerson = findViewById(R.id.tvAddPerson);

        isOpen = false;

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpen){
                    btnAddUser.setVisibility(View.GONE);
                    btnAddContact.setVisibility(View.GONE);
                    tvAddContact.setVisibility(View.GONE);
                    tvAddPerson.setVisibility(View.GONE);

                    isOpen = false;
                }else{
                    btnAddUser.setVisibility(View.VISIBLE);
                    btnAddContact.setVisibility(View.VISIBLE);
                    tvAddContact.setVisibility(View.VISIBLE);
                    tvAddPerson.setVisibility(View.VISIBLE);
                    isOpen = true;
                }
            }
        });

    }
}