package com.coursera.springboot.webappfrompackt.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@SessionAttributes("username")
@Controller
public class LoginController {

    private ValidateAuthentication validateAuthentication;

    public LoginController(ValidateAuthentication validateAuthentication) {
        this.validateAuthentication = validateAuthentication;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String gotoLoginPage(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String username,
                                  @RequestParam String password,
                                  ModelMap model){

        if (validateAuthentication.authenticate(username, password)) {
            model.put("username", username);

            return "welcome";
        }

        model.put("errorMessage", "Credetials are incorrect, try again!");

        return "login";
    }
}
