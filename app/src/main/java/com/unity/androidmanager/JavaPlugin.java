package com.unity.androidmanager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;

public class JavaPlugin extends UnityPlayerActivity {

    private String _loginType;
    private String _iapType;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Log.d("#####", "onCreate()");
        super.onCreate(savedInstanceState);
    }

    public void CallAndroidInit(String type)
    {
        Log.d("#####", "CallAndroidInit()");
        this._iapType = type;
    }

    public void CallAndroid(String type)
    {
        Log.d("#####", "CallAndroid()");
        Intent loginIntent;

        if(type.equals("google_login"))
        {
            loginIntent = new Intent(this, GoogleLogin.class);
            startActivity(loginIntent);
        }
        else if(type.equals("naver_login"))
        {
            loginIntent = new Intent(this, NaverLogin.class);
            startActivity(loginIntent);
        }
    }

    @Override
    public void onBackPressed() {
        Log.d("#####", "onBackPressed()");
        //super.onBackPressed();
    }
}
