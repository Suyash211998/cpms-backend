package com.suyash.dao;

import com.suyash.model.InstituteUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituteUserDao extends JpaRepository<InstituteUser, Integer> {
    InstituteUser findByUsername(String username);
}
