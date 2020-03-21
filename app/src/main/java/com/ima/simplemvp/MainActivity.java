package com.ima.simplemvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ima.simplemvp.presenter.MainpresenterImp;
import com.ima.simplemvp.presenter.Mainview;

public class MainActivity extends AppCompatActivity implements Mainview {
    EditText edtunem, edtpasswd;
    Button btnlogin;
    TextView tvhasil;
    private MainpresenterImp PresenterImp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtunem = findViewById(R.id.edtunem);
        edtpasswd = findViewById(R.id.edtpasswd);
        tvhasil = findViewById(R.id.tvhasil);
        btnlogin = findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double username = Double.valueOf(edtunem.getText().toString());
                Double password = Double.valueOf(edtpasswd.getText().toString());
                PresenterImp.Login(username,password);
            }
        });
    }

    @Override
    public void setUsernameError() {

    }

    @Override
    public void setPasswordError() {

    }

    @Override
    public void showProgressbar() {

    }

    @Override
    public void hideProgressbar() {

    }

    @Override
    public void onLoginSuccess(String username) {

    }

    @Override
    public void onLoginError() {

    }

    @Override
    public void hasiltext(Double login) { tvhasil.setText(login.toString());

    }
}
