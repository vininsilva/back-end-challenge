package br.com.challenge.dto;

public class AccountDTO {

	private Integer id;

	private String name;

	private Integer balance;

	private String date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "AccountDTO [id=" + id + ", name=" + name + ", balance=" + balance + ", date=" + date + "]";
	}

}
