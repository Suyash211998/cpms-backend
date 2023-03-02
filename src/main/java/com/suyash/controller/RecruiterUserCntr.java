package com.suyash.controller;

import com.suyash.model.InstituteUser;
import com.suyash.model.RecruiterUser;
import com.suyash.services.RecruiterUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class RecruiterUserCntr {

    @Autowired
    private RecruiterUserServices userServices;

    @PostMapping(value = {"/recruiter_user"})
    public String userAdd(@RequestBody RecruiterUser user){
        userServices.add(user);
        return "Success";
    }


    @PutMapping(value = {"/recruiter_user"})
    public String userUpdate(@RequestBody RecruiterUser user) {
        userServices.modify(user);
        return "success";
    }
    @DeleteMapping(value = {"/recruiter_user/{id}"})
    public String userDelete(@PathVariable int id) {
        userServices.removeById(id);
        return "success";
    }

    @GetMapping(value = {"/recruiter_user/{id}"})
    public RecruiterUser userGet(@PathVariable int id) {
        return userServices.getById(id);
    }

    @GetMapping(value = {"/recruiter/{username}"})
    public List<InstituteUser> userListByUsername(@PathVariable String username){
        return userServices.getAllUserByUsername(username);
    }
}
