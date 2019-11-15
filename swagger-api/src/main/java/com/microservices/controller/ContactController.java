package com.microservices.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.model.Contact;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags="Contacts",description="Contacts")
public class ContactController {
	

	@RequestMapping(value="/contacts",method=RequestMethod.GET)
	@ApiOperation(value="GET Contacts", notes="Get Contacts from User")
	public List<Contact> fetchContacts(){
		return Arrays.asList(
				new Contact(111,"Abhishek","8919109270","abhishekmuthyam@gmail.com"),
				new Contact(222,"Muthyam", "9849349980","muthyama@hcl.com"),
				new Contact(333,"Chinna", "81919109270","chinna@gmail.com")
				);
	}
	
	@RequestMapping(value="/contacts",method=RequestMethod.POST)
	@ApiOperation(value="Add Contacts", notes="Get Contacts from User",response=Contact.class)
	public Contact AddUser(@RequestBody Contact contact){
		return contact;
	}

	
}
