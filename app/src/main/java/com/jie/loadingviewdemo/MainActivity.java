package com.jie.loadingviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	private CustomStatusView mCustomStatusView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mCustomStatusView = findViewById(R.id.csv_status);

		findViewById(R.id.btn_init).setOnClickListener(this);
		findViewById(R.id.btn_success).setOnClickListener(this);
		findViewById(R.id.btn_failure).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.btn_init:
				mCustomStatusView.loadLoading();
				break;
			case R.id.btn_success:
				mCustomStatusView.loadSuccess();
				break;
			case R.id.btn_failure:
				mCustomStatusView.loadFailure();
				break;
		}
	}
}
