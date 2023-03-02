package com.suyash.services;


import com.suyash.model.InstituteUser;
import com.suyash.model.RecruiterUser;

import java.util.List;

public interface RecruiterUserServices {
    void add(RecruiterUser user);
    void modify(RecruiterUser user);
    void removeById(int id);
    RecruiterUser getById(int id);

    boolean existsById(int id);

    List<InstituteUser> getAllUserByUsername(String username);


}
