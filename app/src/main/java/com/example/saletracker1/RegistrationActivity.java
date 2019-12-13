package com.example.saletracker1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.saletracker1.pojo.RegisterRequest;
import com.example.saletracker1.pojo.RegisterResponse;
import com.example.saletracker1.ws.APIService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegistrationActivity extends AppCompatActivity {

    String loginType;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        loginType = getIntent().getStringExtra(SelectLoginActivity.SELECT_TYPE_KEY);


        final EditText eTCompanyName= findViewById(R.id.edit_text_sign_up_company_name);
        final EditText eTOwnerName= findViewById(R.id.edit_text_sign_up_owner_name);
        final EditText eTAddress= findViewById(R.id.edit_text_sign_up_address);
        final EditText eTPhone= findViewById(R.id.edit_text_sign_up_phone);
        final EditText eTEmail= findViewById(R.id.edit_text_sign_up_email);
        final EditText eTPassword= findViewById(R.id.edit_text_sign_up_password);

        Button buttonSignUp = findViewById(R.id.buttonSignIn);

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sCompanyName = eTCompanyName.getText().toString();
                String sOwnerName = eTOwnerName.getText().toString();
                String sAddress = eTAddress.getText().toString();
                String sPhone = eTPhone.getText().toString();
                String sEmail = eTEmail.getText().toString();
                String sPassword = eTPassword.getText().toString();

                RegisterRequest registerRequest= new RegisterRequest(sCompanyName,sOwnerName,
                        sAddress,sPhone,sEmail,sPassword);


                Retrofit retrofit = new  Retrofit.Builder()
                        .baseUrl("")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                APIService service = retrofit.create(APIService.class);

                Call<RegisterResponse> registerResponse = service.Register(registerRequest);

                registerResponse.enqueue(new Callback<RegisterResponse>() {
                    @Override
                    public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {

                    }

                    @Override
                    public void onFailure(Call<RegisterResponse> call, Throwable t) {

                    }
                });




                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                intent.putExtra(SelectLoginActivity.SELECT_TYPE_KEY, loginType);
                startActivity(intent);
            }
        });



    }

    public void buttonSignUpClick(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra(SelectLoginActivity.SELECT_TYPE_KEY, loginType);
        startActivity(intent);
    }
}
