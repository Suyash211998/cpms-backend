package com.suyash.services;


import com.suyash.dao.RecruiterUserDao;
import com.suyash.model.InstituteUser;
import com.suyash.model.RecruiterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecruiterUserServicesImpl implements RecruiterUserServices {

    @Autowired
    private RecruiterUserDao userDao;

    @Override
    public void add(RecruiterUser user) {
        userDao.save(user);
    }

    @Override
    public void modify(RecruiterUser user) {
        userDao.save(user);
    }

    @Override
    public void removeById(int id) {
        userDao.deleteById(id);
    }

    @Override
    public RecruiterUser getById(int id) {
        Optional<RecruiterUser> opt = userDao.findById(id);
        if(opt.isPresent()) {
            return opt.get();
        }
        return null;
    }

    @Override
    public boolean existsById(int id) {
        return userDao.existsById(id);
    }

    @Override
    public List<InstituteUser> getAllUserByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
