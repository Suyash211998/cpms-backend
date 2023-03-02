package com.suyash.dao;



import com.suyash.model.InstituteUser;
import com.suyash.model.RecruiterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecruiterUserDao extends JpaRepository<RecruiterUser, Integer> {
    public List<InstituteUser> findByUsername(@Param(value = "username") String username);
}
