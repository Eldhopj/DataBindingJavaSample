package com.example.databindingjavasample;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.databindingjavasample.databinding.FragmentDataBindingBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataBindingFragment extends Fragment {


    public DataBindingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentDataBindingBinding binding = FragmentDataBindingBinding.inflate(inflater, container, false);
        //set binding variables here
        binding.fragmentTv.setText("helloFragment");
        return binding.getRoot();
    }

}
