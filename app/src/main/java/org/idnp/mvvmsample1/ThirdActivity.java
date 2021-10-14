package org.idnp.mvvmsample1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import org.idnp.mvvmsample1.databinding.ActivityMainBinding;
import org.idnp.mvvmsample1.databinding.ActivityThirdBinding;
import org.idnp.mvvmsample1.viewmodels.LoginViewModel;
import org.idnp.mvvmsample1.viewmodels.ThridViewModel;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_third);

       ActivityThirdBinding bindig =
                DataBindingUtil.setContentView(this, R.layout.activity_third);
        bindig.setMiVista(new ThridViewModel());
        bindig.executePendingBindings();
    }
}