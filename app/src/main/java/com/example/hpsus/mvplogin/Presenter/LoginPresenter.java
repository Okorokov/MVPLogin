package com.example.hpsus.mvplogin.Presenter;

import com.example.hpsus.mvplogin.Model.User;
import com.example.hpsus.mvplogin.View.ILoginView;

public class LoginPresenter implements ILoginPresenter {

    ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String passworf) {
        User user= new User(email,passworf);
        boolean isLoginSuccess=user.isValidData();

        if(isLoginSuccess)
            loginView.onLoginResult("Login Success");
        else
            loginView.onLoginResult("Login error");
    }
}
