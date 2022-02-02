package com.chenson2910.mycrudboot.repository;


import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<com.chenson2910.mycrudboot.model.User, Integer> {
public Long countById(Integer id);
}
