package com.unity.androidmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JavaPlug extends AppCompatActivity {

    private String _loginType;
    private String _iapType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_plug);
    }

    public void CallAndroid()
    {

    }

    public void CallAndroid(String type)
    {
        Intent loginIntent;

        if(type == "Google")
        {
            loginIntent = new Intent(this, GoogleLogin.class);
            startActivity(loginIntent);

        }
        else if(type == "Naver")
        {

        }
    }
}
