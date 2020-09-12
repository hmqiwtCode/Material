package com.quy.material;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FloatButton extends AppCompatActivity {

    private FloatingActionButton btnAdd, btnAddUser, btnAddContact;
    private TextView tvAddContact, tvAddPerson;
    private boolean isOpen;

    private Animation fabOpenAnimation, fabCloseAnimation;


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
                    loadAnimation();
                    btnAddUser.setAnimation(fabCloseAnimation);
                    btnAddContact.setAnimation(fabCloseAnimation);
                    tvAddContact.setVisibility(View.INVISIBLE);
                    tvAddPerson.setVisibility(View.INVISIBLE);

                    isOpen = false;
                }else{
                    loadAnimation();
                    btnAddUser.setAnimation(fabOpenAnimation);
                    btnAddContact.setAnimation(fabOpenAnimation);
                    tvAddContact.setVisibility(View.VISIBLE);
                    tvAddPerson.setVisibility(View.VISIBLE);
                    isOpen = true;
                }
            }
        });

    }

    private void loadAnimation(){
        fabOpenAnimation = AnimationUtils.loadAnimation(FloatButton.this,R.anim.fab_open);
        fabCloseAnimation = AnimationUtils.loadAnimation(FloatButton.this,R.anim.fab_close);
    }
}