package com.ima.simplemvp.presenter;

public interface Mainview {
    void setUsernameError();
    void setPasswordError();
    void showProgressbar();
    void hideProgressbar();
    void onLoginSuccess(String username);
    void onLoginError();

    void hasiltext(Double login);
}
