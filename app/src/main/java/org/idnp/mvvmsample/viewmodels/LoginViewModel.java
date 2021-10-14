package org.idnp.mvvmsample.viewmodels;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import org.idnp.mvvmsample.BR;
import org.idnp.mvvmsample.SecondActivity;
import org.idnp.mvvmsample.model.User;

public class LoginViewModel extends BaseObservable {

    private User user;
    private String successMessage = "Login was successful";
    private String errorMessage = "Email or Password not valid";
    private Context context;

    @Bindable
    private String toastMessage = null;

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {

        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    @Bindable
    public String getUserEmail() {
        return user.getEmail();
    }

    @Bindable
    public String getUserPassword() {
        return user.getPassword();
    }

    public void setUserEmail(String email) {
        Log.d("AAA", email);
        user.setEmail(email);
        notifyPropertyChanged(BR.userEmail);
    }

    public void setUserPassword(String password) {
        user.setPassword(password);
        notifyPropertyChanged(BR.userPassword);
    }

    public LoginViewModel(Context context) {
        user = new User();
        this.context = context;
    }

    public void onLoginClicked() {
        if (isInputDataValid())
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(getUserEmail())
                && Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches()
                && getUserPassword().length() > 5;
    }

    public void onSecondActivity() {
        Intent intent = new Intent(context, SecondActivity.class);
        context.startActivity(intent);
    }

}
