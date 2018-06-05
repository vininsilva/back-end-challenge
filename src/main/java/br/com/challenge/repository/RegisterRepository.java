package br.com.challenge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.challenge.model.Account;

@Repository
public interface RegisterRepository extends CrudRepository<Account, Long> {

}
