package com.suyash.controller;

import com.suyash.model.InstituteUser;
import com.suyash.services.InstituteUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class InstituteUserCntr {

    @Autowired
    private InstituteUserServices userServices;

    @PostMapping(value = {"/institute_user"})
    public String userAdd(@RequestBody InstituteUser user){
        userServices.add(user);
        return "Success";
    }


    @PutMapping(value = {"/institute_user"})
    public String userUpdate(@RequestBody InstituteUser user) {
        userServices.modify(user);
        return "success";
    }
    @DeleteMapping(value = {"/institute_user/{id}"})
    public String userDelete(@PathVariable int id) {
        userServices.removeById(id);
        return "success";
    }

    @GetMapping(value = {"/institute_user/{id}"})
    public InstituteUser userGet(@PathVariable int id) {
        return userServices.getById(id);
    }
}
