package org.idnp.mvvmsample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.idnp.mvvmsample.databinding.ActivityUnitBinding;
import org.idnp.mvvmsample.databinding.ActivityUnitDetailBinding;
import org.idnp.mvvmsample.viewmodels.UnitDetailViewModel;

public class UnitDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_unit);
        ActivityUnitDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_unit_detail);
        binding.setUnitDetailViewModel(new UnitDetailViewModel());
        binding.executePendingBindings();
    }
}