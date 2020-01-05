package com.itschool.practise36.fragmentdinamicex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.itschool.practise36.fragmentdinamicex.fragments.FragmentButton;
import com.itschool.practise36.fragmentdinamicex.fragments.FragmentImage;

public class MainActivity extends AppCompatActivity {
    Button next;
    int picture_number;
    FragmentButton fragmentButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = findViewById(R.id.button_next);
        if (savedInstanceState == null) {
            /*
            * добавьте фрагмент с кнопками на активити
            */
        }



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), CatGallery.class);
                intent.putExtra("number", fragmentButton.getNumber());
                startActivity(intent);
            }
        });


    }
}
