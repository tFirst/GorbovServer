package com.server.gorbov.controller;


import com.server.gorbov.service.user.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class Admin {

    final UserService userService;

    public Admin(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path = "/updUserRole", method = RequestMethod.POST)
    public String updUserRole(@RequestParam String userName,
                                 @RequestParam Integer role) {
        return userService.updUserRole(userName, role).toString();
    }
}
