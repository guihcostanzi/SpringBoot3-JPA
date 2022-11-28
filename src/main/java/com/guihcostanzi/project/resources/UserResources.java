package com.guihcostanzi.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guihcostanzi.project.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1l, "UserX", "userx@gmail.com", "43977664509", "pw1234");
		
		return ResponseEntity.ok().body(u);
		
	}
}
