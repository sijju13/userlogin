package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserRepository;

@RestController
public class AdminController {
	
	@Autowired
	UserRepository userrep;
	
	
	// view users
		@GetMapping("/view")
		public List<User> findAllUsers(){
			return userrep.findAll();
		}
		
		@GetMapping("/view/{userid}")
		public User getUser(@PathVariable int userid)
		{
			Optional<User> task = userrep.findById(userid);
			User retreiveobj = null;
			if(task.isPresent())
			{
				retreiveobj = task.get();
			}
			return retreiveobj;
		}
		
		
		// add users
		@PostMapping("/adduser")
		public User insertUser(@RequestBody User obj) {
			User p = userrep.save(obj);
			return p;
		}
		
		
		
		// update user
		@PutMapping("/update")
		public User updateUser(@RequestBody User obj) {
			int pid = obj.getUserid();
			Optional<User> user = userrep.findById(pid);
			User update = null;
			if(user.isPresent())
			{
				update = user.get();
				update.setUsername(obj.getUsername());
				update.setFirstname(obj.getFirstname());
				update.setLastname(obj.getLastname());
				update.setPassword(obj.getPassword());
				userrep.save(update);
			}
			return update;
		}
		
		
		@DeleteMapping("/delete/{userid}")
		public void deleteUser(@PathVariable int userid) {
			userrep.deleteById(userid);
		}
	}
	


