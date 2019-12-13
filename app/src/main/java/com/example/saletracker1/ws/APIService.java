package com.example.saletracker1.ws;

import com.example.saletracker1.pojo.LoginRequest;
import com.example.saletracker1.pojo.RegisterRequest;
import com.example.saletracker1.pojo.RegisterResponse;import com.example.saletracker1.pojo.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIService {


    @POST("Register")
    Call<RegisterResponse> Register(@Body RegisterRequest registerRequest);

    @POST("Login")
    Call<LoginResponse> Login(@Body LoginRequest loginRequest);



}
