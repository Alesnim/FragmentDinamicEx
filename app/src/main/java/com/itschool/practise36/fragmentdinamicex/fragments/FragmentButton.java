package com.itschool.practise36.fragmentdinamicex.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.itschool.practise36.fragmentdinamicex.R;

public class FragmentButton extends Fragment implements View.OnClickListener {

    int number_image =1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_button, container, false);





        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button button1 = getView().findViewById(R.id.button_1);
        button1.setOnClickListener(this);

        Button button2 = getView().findViewById(R.id.button_2);
        button2.setOnClickListener(this);

        Button button3 = getView().findViewById(R.id.button_3);
        button3.setOnClickListener(this);

        Button button4 = getView().findViewById(R.id.button_4);
        button4.setOnClickListener(this);
    }
    /**
     * допишите реализацию работы кнопок с картинками
     */

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_1:
                number_image = 1;

                break;
            case R.id.button_2:
                number_image = 2;

                break;
            case R.id.button_3:
                number_image = 3;

                break;
            case R.id.button_4:
                number_image = 4;

                break;
        }

        FragmentImage fragmentImage = (FragmentImage) getFragmentManager().findFragmentById(R.id.container2);

        if (fragmentImage !=null && fragmentImage.isInLayout()){
            fragmentImage.setNumber(number_image);
            fragmentImage.setImage();
        }

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRetainInstance(true);
    }

    public int getNumber() {
        return number_image;
    }
}
