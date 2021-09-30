package com.openbeats.openbeatsdaw.controller;

import com.openbeats.openbeatsdaw.Entity.User;
import com.openbeats.openbeatsdaw.Service.CreateUser;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/")
@Slf4j
public class OpenBeatsRestController {

    @Autowired
    private CreateUser createUser;

    @PostMapping("/createUser")
    public String createUser(@RequestBody User user){
        log.info("Inside create User method of User Controller");
         return createUser.saveUser(user);

    }


}