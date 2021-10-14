package org.idnp.mvvmsample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.idnp.mvvmsample.databinding.ActivitySecondBinding;
import org.idnp.mvvmsample.viewmodels.SecondViewModel;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);

        ActivitySecondBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        binding.setViewModel(new SecondViewModel());
        binding.executePendingBindings();


    }
}