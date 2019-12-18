package com.example.saletracker1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.saletracker1.pojo.LoginRequest;
import com.example.saletracker1.pojo.LoginResponse;
import com.example.saletracker1.ws.APIService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {

    LinearLayout signUpView;
    String loginType;


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signUpView = findViewById(R.id.sign_up_ll);
        loginType = getIntent().getStringExtra(SelectLoginActivity.SELECT_TYPE_KEY);

        final EditText userName = findViewById(R.id.editText_Login_Username);
        final EditText password = findViewById(R.id.editText_Login_Password);

        if (loginType.equals(SelectLoginActivity.TYPE_EMPLOYEE)) {
            signUpView.setVisibility(View.GONE);
        }



        /*Button butonSignIn = findViewById(R.id.buttonSignIn);

        butonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loginUserName = userName.getText().toString();
                String loginPassword = password.getText().toString();

                LoginRequest loginRequest = new LoginRequest(loginUserName, loginPassword);

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("http://backtowork.icfoss.qleapbs.com/sale-tracker/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                APIService service = retrofit.create(APIService.class);

                Call<LoginResponse> loginResponse = service.Login(loginRequest);

                loginResponse.enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                        intent.putExtra(SelectLoginActivity.SELECT_TYPE_KEY, loginType);
                        startActivity(intent);
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {
                        Toast
                                .makeText(getApplicationContext(),
                                        "Connection Failed!" + t.getMessage().toString(),
                                        Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });*/



    }

    public void buttonSignInClick(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra(SelectLoginActivity.SELECT_TYPE_KEY, loginType);
        startActivity(intent);
    }

    public void processSignUpLinkClick(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);


    }

}