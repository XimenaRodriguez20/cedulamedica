package com.cedula.cedulamedica.service;

import com.cedula.cedulamedica.controller.models.AuthResponse;
import com.cedula.cedulamedica.controller.models.AuthenticationRequest;
import com.cedula.cedulamedica.controller.models.RegisterRequest;

public interface AuthService {
    AuthResponse register (RegisterRequest request);
    AuthResponse authenticate (AuthenticationRequest request);


}
