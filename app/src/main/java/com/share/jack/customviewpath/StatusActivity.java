package com.share.jack.customviewpath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.share.jack.customviewpath.widget.CustomStatusView;

public class StatusActivity extends Activity implements View.OnClickListener {

    private CustomStatusView customStatusView;

    private Button btn_init;
    private Button btnSuccess;
    private Button btnFailure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        customStatusView = (CustomStatusView) findViewById(R.id.as_status);
        btn_init = (Button) findViewById(R.id.btn_init);
        btnSuccess = (Button) findViewById(R.id.btn_success);
        btnFailure = (Button) findViewById(R.id.btn_failure);

        customStatusView.loadLoading();
        btnSuccess.setOnClickListener(this);
        btnFailure.setOnClickListener(this);
        btn_init.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_success:
                customStatusView.loadSuccess();
                break;
            case R.id.btn_failure:
                customStatusView.loadFailure();
                break;
            case R.id.btn_init:
                customStatusView.loadLoading();
                break;
        }
    }
}