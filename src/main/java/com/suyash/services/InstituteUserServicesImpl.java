package com.suyash.services;

import com.suyash.dao.InstituteUserDao;
import com.suyash.model.InstituteUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstituteUserServicesImpl implements InstituteUserServices {

    @Autowired
    private InstituteUserDao userDao;

    @Override
    public void add(InstituteUser user) {
        userDao.save(user);
    }

    @Override
    public void modify(InstituteUser user) {
        userDao.save(user);
    }

    @Override
    public void removeById(int id) {
        userDao.deleteById(id);
    }

    @Override
    public InstituteUser getById(int id) {
        Optional<InstituteUser> opt = userDao.findById(id);
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
    public InstituteUser findUserByUsername(String username) {

        return null;
    }

    @Override
    public List<InstituteUser> findAllUsers() {
        return null;
    }
}
