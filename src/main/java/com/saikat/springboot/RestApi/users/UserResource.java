package com.saikat.springboot.RestApi.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	@Autowired
	private UserDAO dao ;//either we can Autowired do or passing dao as a argument into constructur
//	public UserResource(UserDAO dao) {
//		this.dao=dao;
//	}
	
	@GetMapping(path="/allUsers")
	public List<Users> resourse(){
		return dao.findAll();
	}
	
	@GetMapping("/singleUser/{id}")
	public Users singleResourse(@PathVariable int id){
		return dao.findOne(id); 
	}
	
	@PostMapping("/addUser")
	public Users addUser(@RequestBody Users user) {
		return dao.add(user);
	}

}
