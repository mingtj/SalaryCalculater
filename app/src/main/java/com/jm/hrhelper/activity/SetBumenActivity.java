package com.jm.hrhelper.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.jm.hrhelper.R;

public class SetBumenActivity extends BaseActivity {

    private static final String TAG = "SetBumenActivity";



    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, SetBumenActivity.class);
        return intent;
    }

    public static void intentTo(Context context) {
        context.startActivity(newIntent(context));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_bumen);
    }
}
