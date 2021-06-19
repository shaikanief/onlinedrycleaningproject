package com.drycleaning.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drycleaning.bean.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

}
 
