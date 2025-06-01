package com.coursera.springboot.webappfrompackt.login;

import org.springframework.stereotype.Service;

@Service
public class ValidateAuthentication {

    public boolean authenticate(String username, String password){
        boolean isValidUsername = username.equalsIgnoreCase("alex");
        boolean isValidPassword = password.equalsIgnoreCase("adm");

        return isValidUsername && isValidPassword;
    }
}
