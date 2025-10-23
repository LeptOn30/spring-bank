package com.dgw.backend.auth_users.services;

import com.dgw.backend.auth_users.dtos.LoginRequest;
import com.dgw.backend.auth_users.dtos.LoginResponse;
import com.dgw.backend.auth_users.dtos.RegistrationRequest;
import com.dgw.backend.auth_users.dtos.ResetPasswordRequest;
import com.dgw.backend.res.Response;

public interface AuthService {
    Response<String > register(RegistrationRequest request);
    Response<LoginResponse> login(LoginRequest loginRequest);
    Response<? > forgetPassword(String email);
    Response<? > updatePasswordViaResetCode(ResetPasswordRequest resetPasswordRequest);
}
