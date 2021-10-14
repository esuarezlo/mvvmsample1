package org.idnp.mvvmsample1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import org.idnp.mvvmsample1.databinding.ActivityFourthBinding;
import org.idnp.mvvmsample1.databinding.ActivitySecondBinding;
import org.idnp.mvvmsample1.viewmodels.FourthVideModel;
import org.idnp.mvvmsample1.viewmodels.SecondViewModel;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_fourth);

        ActivityFourthBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_fourth);
        binding.setMiViewModelo(new FourthVideModel());
        binding.executePendingBindings();
    }
}