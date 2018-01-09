package com.server.gorbov.controller;

import com.server.gorbov.common.state.StateMain;
import com.server.gorbov.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class Auth {

    private final UserService userService;

    @Autowired
    public Auth(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public StateMain auth(@RequestParam String name,
                          @RequestParam String password) {
        return userService.auth(name, password);
    }
}
