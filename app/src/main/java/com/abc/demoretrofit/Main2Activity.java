package com.abc.demoretrofit;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTextView = (TextView) findViewById(R.id.text_view_token);
        mTextView.setText(getData());
    }

    private String getData() {
        SharedPreferences sharedPreferences = getSharedPreferences(Constants.MY_BOX, MODE_PRIVATE);
        return sharedPreferences.getString(Constants.MY_TOKEN, "");
    }
}
