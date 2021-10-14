package org.idnp.mvvmsample1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.idnp.mvvmsample1.databinding.ActivitySecondBinding;
import org.idnp.mvvmsample1.viewmodels.SecondViewModel;

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