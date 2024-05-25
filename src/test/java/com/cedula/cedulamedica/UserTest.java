package com.cedula.cedulamedica;



import com.cedula.cedulamedica.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserTest {

    public User nuevoUsuarioVacio ;
    public User nuevoUsuario ;

    public Object prueba;


    @BeforeEach
    public void setUp() {
        nuevoUsuarioVacio = new User();
        nuevoUsuario = new User("3","jordy","bautis","jordybautis@gmail.com",  21 , "123456");
    }

    @Test
    public void crearUser (){
        assertEquals(nuevoUsuarioVacio.getClass(),User.class);
    }


    @Test
    public void setEmailUsuario (){
        String email = "santiago@gmail.com";
        nuevoUsuario.setEmail(email);
        assertEquals(nuevoUsuario.getEmail(), email);
    }


    @Test
    public void setPasswordUsuario (){
        String password = "654321";
        nuevoUsuario.setPassword(password);
        assertEquals(nuevoUsuario.getPassword(), password);
    }


}