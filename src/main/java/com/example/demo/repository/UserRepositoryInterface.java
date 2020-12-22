package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.User;

public interface UserRepositoryInterface extends CrudRepository<User, Long>{

}
