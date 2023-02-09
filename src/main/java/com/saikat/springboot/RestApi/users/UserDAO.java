package com.saikat.springboot.RestApi.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;
@Component
public class UserDAO {
	//create a array list to store data
		private static List<Users> customer = new ArrayList<>();
		private static int count=0;
		static {
			customer.add(new Users(++count,"Saikat",LocalDate.now().minusYears(20)));
			customer.add(new Users(++count,"Souvik",LocalDate.now().minusYears(25)));
			customer.add(new Users(++count,"Babu",LocalDate.now().minusYears(30)));
		}
		
		public List<Users> findAll() {
			return customer; 
		}
		
		public Users findOne( int id){
			//Learn functional programming to understand below codes
			Predicate<? super Users> predicate = user -> user.getId().equals(id);
			return customer.stream().filter(predicate).findFirst().get();
			
		}
		
		public Users add (Users user) {
			user.setId(++count);
			customer.add(user);
			return user;
		}

}
