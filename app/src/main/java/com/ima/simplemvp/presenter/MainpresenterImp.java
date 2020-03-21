package com.ima.simplemvp.presenter;

import com.ima.simplemvp.MainActivity;

public class MainpresenterImp implements Mainpresenter  {
    Mainview mainview;

    public MainpresenterImp(MainActivity mainview) {
        this.mainview = (Mainview) mainview;
    }
    @Override
    public void Login(Double username, Double password) {
            Double login = username + password;
            mainview.hasiltext(login);
    }



}

