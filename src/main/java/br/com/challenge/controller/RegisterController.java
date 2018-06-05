package br.com.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.challenge.model.Account;
import br.com.challenge.service.RegisterService;

@RestController
@RequestMapping("/api")
public class RegisterController {
	
	@Autowired
	public RegisterService registerService;
	
	@GetMapping("/accounts")
	public List<Account> retrieveAccounts() {
		
		List<Account> search = registerService.retrieveAccounts();
		System.out.println(search.toString());
		
		return search;
	}

}
