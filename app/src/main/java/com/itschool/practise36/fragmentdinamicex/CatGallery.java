package com.itschool.practise36.fragmentdinamicex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.itschool.practise36.fragmentdinamicex.fragments.FragmentButton;
import com.itschool.practise36.fragmentdinamicex.fragments.FragmentImage;

public class CatGallery extends AppCompatActivity {
    FragmentImage fragmentImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_gallery);
        if(savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            fragmentImage = new FragmentImage();
            transaction.add(R.id.container, fragmentImage, "image");
            transaction.commit();
            Log.d("CAT", Integer.toString(getIntent().getIntExtra("number", 1)));
            fragmentImage.setNumber(getIntent().getIntExtra("number", 1));

        }





        Button return_bt = findViewById(R.id.button_return);
        return_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
