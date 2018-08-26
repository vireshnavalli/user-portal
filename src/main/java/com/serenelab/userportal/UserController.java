package com.serenelab.userportal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;


//@CrossOrigin(origins="http://localhost:4600",maxAge=3600)
@RestController
@RequestMapping({"/api"})
public class UserController {

	@Autowired
	private UserService userservice;
	
	
	
	@PostMapping
	public User create(@RequestBody User user) {
		return userservice.create(user);
	}
	
	
	@GetMapping(path= {"/{id}"})
	public User findById(@PathVariable("id") int id) {
		return userservice.findById(id);
	}
	
	@PutMapping
	public User update(@RequestBody User user) {
		return userservice.update(user);
	}
	
	@DeleteMapping(path= {"/{id}"})
	public User delete(@PathVariable("id")int id) {
		return userservice.delete(id);
	}
	
	@GetMapping
	public List<User> findAll() {
	 
		return userservice.findAll();
	}
	
}















