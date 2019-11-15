package com.microservices.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags="Users",description="Users Info")
public class UserController {

	@GetMapping("/getUsers")
	@ApiOperation(value="GET All Users", notes="Get All Users")
	public List<User> getUsers() {
		return Arrays.asList(
				new User("Abhishek", 50000L),
				new User("Muthyam",50000L)
				);
	}
	
	@GetMapping("/getUser/{user}")
	@ApiImplicitParams({
		@ApiImplicitParam(name="userName",value="User Name",paramType="path")
	})
	@ApiOperation(value="GET User", notes="Get User")
	public User getUser(@PathVariable("userName") final String userName) {
		return new User(userName, 50000L);
	}
	
	@GetMapping("/getUser/{userName}")
	@ApiImplicitParams({
		@ApiImplicitParam(name="userName",value="User Name",paramType="path")
	})
	@ApiOperation(value="GET User", notes="Get User")
	public User getUserName(@RequestParam(value="userName") final String userName) {
		return new User(userName, 50000L);
	}
	
	@PostMapping(value="/addUser")
	@ApiOperation(value="Add User", notes="Add User")
	public String addUser(@RequestBody final String user) {
		return user;
	}
	
	@PutMapping(value="/updateUser")
	@ApiOperation(value="Update User", notes="Update User")
	public String updateUser(@RequestBody final String user) {
		return user;
	}
	
}
