package com.itschool.practise36.fragmentdinamicex.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.itschool.practise36.fragmentdinamicex.R;

public class FragmentImage extends Fragment {
    View view;
    int number_image=1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_image, container, false);
        setImage();
        return view;
    }

    public void setImage() {
        ImageView image = view.findViewById(R.id.image_view);
        switch (number_image){
            case 1:
                image.setImageResource(R.drawable.cat1);
                break;

        }

    }

    public void setNumber(int number){
        number_image = number;
    }
}
