package com.cedula.cedulamedica.entity;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Document(collection = "user_collection")
@Data
//@AllArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements UserDetails {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    @Field
    private String username;
    @Field
    public String lastName;
    @Field
    @Indexed(unique = true)
    private String email;
    @Field
    private int age;
    @Field
    private String password;
    @Field
    private String role = "user";

    public User(String number, String jordy, String bautis, String mail, int i, String number1) {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role));
    }

    public String getUsername() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
