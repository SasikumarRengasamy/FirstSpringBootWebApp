package com.ciber.dao;

import org.springframework.data.repository.CrudRepository;

import com.ciber.model.User;

public interface UserRepo extends CrudRepository<User, Integer>{

}
