package com.myinstagram.instagramclone.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myinstagram.instagramclone.Entity.Users;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer>{
	
	Users save(Users user);
	Users findByUserId(String userId);

}
