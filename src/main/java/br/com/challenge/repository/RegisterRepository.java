package br.com.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.challenge.model.Account;

@Repository
public interface RegisterRepository extends JpaRepository<Account, Integer> {

}
