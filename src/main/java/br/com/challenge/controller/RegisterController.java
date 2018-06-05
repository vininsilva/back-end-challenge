package br.com.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.challenge.model.Account;
import br.com.challenge.service.RegisterService;

@Controller
@RequestMapping("/api")
public class RegisterController {
	
	@Autowired
	public RegisterService registerService;
	
	@GetMapping("/accounts")
	public List<Account> retrieveAccounts() {
		System.out.println(registerService.retrieveAccounts());
		return registerService.retrieveAccounts();
	}
	
	@PostMapping("/accounts")
	public void registerAccount() {
		
	}

}
