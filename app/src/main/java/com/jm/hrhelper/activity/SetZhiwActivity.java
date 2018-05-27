package com.jm.hrhelper.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.jm.hrhelper.R;

public class SetZhiwActivity extends BaseActivity {

    private static final String TAG = "SetZwActivity";

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, SetZhiwActivity.class);
        return intent;
    }

    public static void intentTo(Context context) {
        context.startActivity(newIntent(context));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_zhiw);
    }
}
