package br.com.challenge.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.challenge.model.Account;
import br.com.challenge.repository.RegisterRepository;
import br.com.challenge.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	public RegisterRepository registerRepository;

	@Override
	public List<Account> retrieveAccounts() {
		
		List<Account> accountResult = registerRepository.findAll();
		List<Account> accountList = new ArrayList<Account>();
		
		for (Account acc: accountResult) {
			
			Account account = new Account();
			account.setId(acc.getId());
			account.setName(acc.getName());
			account.setBalance(acc.getBalance());
			account.setDate(acc.getDate());
			accountList.add(account);
		}
		
		return accountList;
	}

}
