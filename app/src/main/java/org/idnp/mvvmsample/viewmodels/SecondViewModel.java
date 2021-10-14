package org.idnp.mvvmsample.viewmodels;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import org.idnp.mvvmsample.BR;

/**
 *
 */
public class SecondViewModel extends BaseObservable {
    private static final String TAG = "SecondViewModel";
    private String message;

    @Bindable
    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        this.message = value;
        Log.d(TAG,value);
        notifyPropertyChanged(BR.message);
    }


}
