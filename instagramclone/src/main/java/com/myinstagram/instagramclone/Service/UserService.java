package com.myinstagram.instagramclone.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myinstagram.instagramclone.Entity.Users;
import com.myinstagram.instagramclone.Repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	public Users submitMetaDataOfUser(Users user) {
		return userRepo.save(user);
	}
	
	public Users displayUserMetaData(String userid) {
		return userRepo.findByUserId(userid);
	}
}


//package com.myinstagram.instagramclone.Service;
//
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.myinstagram.instagramclone.Entity.Users;
//import com.myinstagram.instagramclone.Repository.UserRepo;
//
//@Service
//public class UserService {
//	
//	//sending service to repo
//	@Autowired
//	UserRepo userRepo;
//	
//	public Users submitMetaDataOfUser(Users user) {
//		return userRepo.save(user);
//		
//	}
//	
//	public Users displayUserMetaData(String userid) {
//		return userRepo.findByUserId(userid);
//	}
//
//}
