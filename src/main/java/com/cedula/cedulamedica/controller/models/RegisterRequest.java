package com.cedula.cedulamedica.controller.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    private String id;
    private String username;
    private String lastName;
    private String email;
    private int age;
    private String password;
    private String role;



}
