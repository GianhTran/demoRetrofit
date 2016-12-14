package com.abc.demoretrofit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.abc.demoretrofit.model.LoginWrapper;
import com.abc.demoretrofit.network.ApiInterface;
import com.abc.demoretrofit.network.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private EditText mEdtEmail;
    private EditText mEdtPassword;
    private Button mBtnSubmit;
    private TextView mTvToken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        handleEvent();
    }

    private void initView() {
        mEdtEmail = (EditText) findViewById(R.id.edt_email);
        mEdtPassword = (EditText) findViewById(R.id.edt_password);
        mBtnSubmit = (Button) findViewById(R.id.btn_submit);
        mTvToken = (TextView) findViewById(R.id.text_view_token);
    }

    private void handleEvent() {
        mBtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login(mEdtEmail.getText().toString(), mEdtPassword.getText().toString());
            }
        });
    }

    private void login(String email, String password) {
        ApiInterface apiInterface = ServiceGenerator.createGsonService(ApiInterface.class);
        Call<LoginWrapper> call = apiInterface.logIn(email, password);
        call.enqueue(new Callback<LoginWrapper>() {
            @Override
            public void onResponse(Call<LoginWrapper> call, Response<LoginWrapper> response) {
                if (response.body() == null) return;
                Toast.makeText(getApplicationContext(), response.body().getData().getToken(),
                        Toast.LENGTH_SHORT).show();
                mTvToken.setText(response.body().getData().getToken());
                startMainActivity();
            }

            @Override
            public void onFailure(Call<LoginWrapper> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void startMainActivity() {
        startActivity(new Intent(this, Main2Activity.class));
    }
}
