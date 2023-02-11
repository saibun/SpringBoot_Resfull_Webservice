package com.saikat.springboot.RestApi.users;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@GetMapping("/User/{id}")
	public Users singleResourse(@PathVariable int id){
		Users result= dao.findOne(id);
		if(result == null) {
			throw new UserNotFoundException("id:"+id);
		}else {
			return result;
		}
	}
	
	@PostMapping("/User")
	public ResponseEntity<Users > addUser(@RequestBody Users user) {
		Users savedata=dao.add(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedata.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

}
