package com.jm.hrhelper.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.jm.hrhelper.R;

public class SetEmailformatActivity extends BaseActivity {


    private static final String TAG = "SetEmailformatActivity";

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, SetEmailformatActivity.class);
        return intent;
    }

    public static void intentTo(Context context) {
        context.startActivity(newIntent(context));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_emailformat);
    }
}
