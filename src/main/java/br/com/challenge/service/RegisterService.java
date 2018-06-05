package br.com.challenge.service;

import java.util.List;

import br.com.challenge.model.Account;

public interface RegisterService {

	List<Account> retrieveAccounts();
	
	void registerAccount();

}
