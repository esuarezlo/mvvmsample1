package org.idnp.mvvmsample.vista;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.idnp.mvvmsample.R;
import org.idnp.mvvmsample.databinding.ActivityUnitBinding;
import org.idnp.mvvmsample.viewmodels.UnitViewModel;

public class UnitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_unit);
        ActivityUnitBinding binding=
                DataBindingUtil.setContentView(this, R.layout.activity_unit);
        binding.setUnitViewModel(new UnitViewModel());
        binding.executePendingBindings();
    }
}