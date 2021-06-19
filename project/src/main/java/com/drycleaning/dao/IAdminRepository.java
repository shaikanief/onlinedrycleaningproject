package com.drycleaning.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drycleaning.bean.Admin;
import com.drycleaning.bean.User;

@Repository
public interface IAdminRepository extends JpaRepository<User, Integer> {

	Object save(Admin a1);

}

